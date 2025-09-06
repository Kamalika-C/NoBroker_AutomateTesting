package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import objectrepository.Locators;
import utils.Reporter;

public class LoginPage {
	
	WebDriver driver;
	WebDriverWait wait;
	ExtentTest extTest;

	public LoginPage(WebDriver driver, ExtentTest extTest) {
		this.driver=driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		this.extTest=extTest;
	}
	public void clickLogin() {
		driver.findElement(Locators.loginButton).click();
	}
	
	public void enterMobileNumber(String mobile) {
        driver.findElement(Locators.inputNumber).sendKeys(mobile);
    }
//
//    public void clickContinue() {
//        driver.findElement(continueButton).click();
//    }
//
    public void enterOtp(String otp) {
        driver.findElement(Locators.inputNumber).sendKeys(otp);
    }
//
//    public void clickVerifyOtp() {
//        driver.findElement(verifyOtpButton).click();
//    }
//
//    public void clickResendOtp() {
//        driver.findElement(resendOtpLink).click();
//    }
//	}

}
