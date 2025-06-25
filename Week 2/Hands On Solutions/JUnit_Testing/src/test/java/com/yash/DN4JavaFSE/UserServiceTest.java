package com.yash.DN4JavaFSE;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserService();
        System.out.println("=== SETUP ===");
    }

    @AfterEach
    void after() {
        System.out.println("=== AFTER EACH ===\n");
    }

    @Test
    void shouldReturnTrueForValidEmail() {
        // Arrange
        String email = "john@example.com";
        // Act
        boolean result = userService.isEmailValid(email);
        // Assert
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseForEmailWithoutAt() {
        String email = "johnexample.com";
        boolean result = userService.isEmailValid(email);
        assertFalse(result);
    }

    @Test
    void shouldFormatUsernameCorrectly() {
        String firstName = "John";
        String lastName = "Doe";
        String result = userService.formatUsername(firstName, lastName);
        assertEquals("john.doe", result);
    }

    @Test
    void shouldReturnNullIfFirstNameIsNull() {
        String result = userService.formatUsername(null, "Doe");
        assertNull(result);
    }
}
