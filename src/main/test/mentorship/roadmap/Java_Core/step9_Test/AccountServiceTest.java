package mentorship.roadmap.Java_Core.step9_Test;

import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task3_AccountService.forTest.Account;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task3_AccountService.forTest.AccountRepository;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task3_AccountService.forTest.AccountService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AccountServiceTest {
    @Mock
    private AccountRepository accountRepository;
    @Mock
    private Account account;
    @InjectMocks
    private AccountService accountService;

    @Test
    public void successWithDraw() {

        when(accountRepository.findAccountById("1234")).thenReturn(new Account("1234", 300));

        assertTrue(accountService.withdraw("1234", 200));

        verify(accountRepository, Mockito.times(1)).findAccountById("1234");
        verify(accountRepository, Mockito.times(1)).updateAccount(accountRepository.findAccountById("1234"));
    }

    @Test
    public void failedWithDraw() {

        when(accountRepository.findAccountById("1234")).thenReturn(new Account("1234", 300));

        assertFalse(accountService.withdraw("1234", 400));

        verify(accountRepository, Mockito.times(1)).findAccountById("1234");
        verify(accountRepository, never()).updateAccount(account);
    }
    @Test
    public void noAccountWithDraw() {

        when(accountRepository.findAccountById("1234")).thenReturn(null);

        assertFalse(accountService.withdraw("1234", 400));

        verify(accountRepository, Mockito.times(1)).findAccountById("1234");
        verify(accountRepository, never()).updateAccount(account);
    }
}
