package org.example.Selectors;

import org.example.base.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginSelector {

    private WebDriver driver = DriverManager.getDriver();
    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public WebElement loginButton() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.id("Login")));
    }

    public WebElement username() {
        return driver.findElement(By.name("username"));
    }

    public WebElement password() {
        return driver.findElement(By.className("password"));
    }

    public WebElement checkBox() {
        return driver.findElement(By.cssSelector("input[type='checkbox']"));
    }

    public WebElement errorMessage() {
        return driver.findElement(By.id("error"));
    }

    public WebElement forgotPassword() {
        return driver.findElement(By.cssSelector("[text='Forgot Your Password?']"));
    }
}
