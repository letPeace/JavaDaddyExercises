package mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task3_AccountService.solution;

import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task3_AccountService.forTest.Account;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task3_AccountService.forTest.AccountRepository;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task3_AccountService.forTest.AccountService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class AccountServiceTest {
    @Test
    void testSuccessfulWithdrawal() {
        AccountRepository mockAccountRepository = mock(AccountRepository.class);
        AccountService accountService = new AccountService(mockAccountRepository);

        Account mockAccount = new Account("acc123", 500.0);
        when(mockAccountRepository.findAccountById("acc123")).thenReturn(mockAccount);

        boolean result = accountService.withdraw("acc123", 200.0);

        assertTrue(result);
        assertEquals(300.0, mockAccount.getBalance());

        verify(mockAccountRepository, times(1)).findAccountById("acc123");
        verify(mockAccountRepository, times(1)).updateAccount(mockAccount);
    }

    @Test
    void testWithdrawalFailure_InsufficientFunds() {
        AccountRepository mockAccountRepository = mock(AccountRepository.class);
        AccountService accountService = new AccountService(mockAccountRepository);

        Account mockAccount = new Account("acc123", 100.0);
        when(mockAccountRepository.findAccountById("acc123")).thenReturn(mockAccount);

        boolean result = accountService.withdraw("acc123", 200.0);

        assertFalse(result);
        assertEquals(100.0, mockAccount.getBalance());

        verify(mockAccountRepository, times(1)).findAccountById("acc123");
        verify(mockAccountRepository, never()).updateAccount(any());
    }

    @Test
    void testWithdrawalFailure_AccountNotFound() {
        AccountRepository mockAccountRepository = mock(AccountRepository.class);
        AccountService accountService = new AccountService(mockAccountRepository);

        when(mockAccountRepository.findAccountById("unknownAccount")).thenReturn(null);

        boolean result = accountService.withdraw("unknownAccount", 100.0);

        assertFalse(result);

        verify(mockAccountRepository, times(1)).findAccountById("unknownAccount");
        verify(mockAccountRepository, never()).updateAccount(any());
    }
}
