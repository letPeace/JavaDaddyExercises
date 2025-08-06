package mentorship.roadmap.Java_Core.step9_Test;

import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task2_AuthService.forTest.AuthService;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task2_AuthService.forTest.User;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task2_AuthService.forTest.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AuthServiceTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private AuthService authService;

    @Test
    public void testSuccessAuthorization() {

        when(userRepository.findUserByUsername("user")).thenReturn(new User("user","1234"));

        assertTrue(authService.authenticateUser("user", "1234"));

        verify(userRepository, Mockito.times(1)).findUserByUsername("user");
    }

    @Test
    public void testFailedAuthorization() {

        when(userRepository.findUserByUsername("user")).thenReturn(new User("user","1234"));

        assertFalse(authService.authenticateUser("user", "123"));

        verify(userRepository, Mockito.times(1)).findUserByUsername("user");
    }

    @Test
    public void testNotUser() {

        when(userRepository.findUserByUsername("user")).thenReturn(null);

        assertFalse(authService.authenticateUser("user", "123"));

        verify(userRepository, Mockito.times(1)).findUserByUsername("user");
    }
}
