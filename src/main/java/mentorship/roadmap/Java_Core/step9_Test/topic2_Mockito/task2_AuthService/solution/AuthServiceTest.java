package mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task2_AuthService.solution;

import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task2_AuthService.forTest.AuthService;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task2_AuthService.forTest.User;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task2_AuthService.forTest.UserRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class AuthServiceTest {
    @Test
    void testSuccessfulAuthentication() {
        UserRepository mockUserRepository = mock(UserRepository.class);
        AuthService authService = new AuthService(mockUserRepository);

        User mockUser = new User("user1", "password123");
        when(mockUserRepository.findUserByUsername("user1")).thenReturn(mockUser);

        boolean result = authService.authenticateUser("user1", "password123");

        assertTrue(result);
        verify(mockUserRepository, times(1)).findUserByUsername("user1");
    }

    @Test
    void testAuthenticationFailure_WrongPassword() {
        UserRepository mockUserRepository = mock(UserRepository.class);
        AuthService authService = new AuthService(mockUserRepository);

        User mockUser = new User("user1", "password123");
        when(mockUserRepository.findUserByUsername("user1")).thenReturn(mockUser);

        boolean result = authService.authenticateUser("user1", "wrongpassword");

        assertFalse(result);
        verify(mockUserRepository, times(1)).findUserByUsername("user1");
    }

    @Test
    void testAuthenticationFailure_UserNotFound() {
        UserRepository mockUserRepository = mock(UserRepository.class);
        AuthService authService = new AuthService(mockUserRepository);

        when(mockUserRepository.findUserByUsername("unknownUser")).thenReturn(null);

        boolean result = authService.authenticateUser("unknownUser", "password123");

        assertFalse(result);
        verify(mockUserRepository, times(1)).findUserByUsername("unknownUser");
    }
}
