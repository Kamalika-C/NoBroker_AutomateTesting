package objectrepository;

import org.openqa.selenium.By;

public class Locators {
	
	//login page locator
	public static By loginButton=By.xpath("//*[@id=\"navHeader\"]/div[5]/div[2]/div[2]/div");
	public static By inputNumber=By.id("signUp-phoneNumber");
	public static By inputOTP=By.xpath("//*[@id=\"login-signup-form\"]/div[4]/div/div/div[2]/div[1]/input");
}
