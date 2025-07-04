package com.example.tests;

import com.example.base.BaseTest;
import com.example.pages.LoginPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends BaseTest {
    private LoginPage loginPage;

    @BeforeEach
    public void navigateToLogin() {
        driver.get("https://www.saucedemo.com/v1/"); // Update URL
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testSuccessfulLogin() {
        String testUser = "testuser@example.com";
        String testPass = "validPassword123";

        loginPage.login(testUser, testPass);

        // Update assertion based on successful login indicator
        // Example: Check dashboard URL or welcome message
        // assertTrue(driver.getCurrentUrl().contains("/dashboard"));
    }
}