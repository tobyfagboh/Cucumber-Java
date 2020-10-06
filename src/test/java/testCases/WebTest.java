package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import Cucumber.Automation.Base;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebTest extends Base {

	public void loginTest() {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty("phone_XPATH"))).sendKeys(prop.getProperty("phone_TEXT"));
		driver.findElement(By.xpath(prop.getProperty("password_XPATH"))).sendKeys(prop.getProperty("password_TEXT"));
		driver.findElement(By.xpath(prop.getProperty("loginBtn_XPATH"))).click();
		System.out.println("Username and password entered");
	}

	public void insertOtp() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty("otp1"))).sendKeys("1");
		driver.findElement(By.xpath(prop.getProperty("otp2"))).sendKeys("2");
		driver.findElement(By.xpath(prop.getProperty("otp3"))).sendKeys("3");
		driver.findElement(By.xpath(prop.getProperty("otp4"))).sendKeys("4");
		driver.findElement(By.xpath(prop.getProperty("otp5"))).sendKeys("5");
		driver.findElement(By.xpath(prop.getProperty("otp6"))).sendKeys("6");
		driver.findElement(By.xpath(prop.getProperty("sendBtn_XPATH"))).click();
		System.out.println("OTP entered");
	}

	public void validateDashBoard() {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String actualString = driver.findElement(By.xpath(prop.getProperty("WelcomeText_XPATH"))).getText();
		Assert.assertEquals(actualString, "Welcome to Yellow Card! What would you like to do today?");
		System.out.println("Login to Yellowcard dashboard validated");
	}

	public void buyCryptoCurrency() {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty("buyCryptoCurrency_XPATH"))).click();
		driver.findElement(By.xpath(prop.getProperty("selectBitcoinCurrency_XPATH"))).click();
		driver.findElement(By.xpath(prop.getProperty("selectNGNwallet_XPATH"))).click();
		driver.findElement(By.xpath(prop.getProperty("enterAmt_XPATH"))).sendKeys(prop.getProperty("amount_TEXT"));
		driver.findElement(By.xpath(prop.getProperty("confirmBtn_XPATH"))).click();
		driver.findElement(By.xpath(prop.getProperty("payBtn_XPATH"))).click();
		System.out.println("Pay button clicked");
	}

	public void BuySuccessMsg() throws InterruptedException {
		
		Thread.sleep(5000);
		String actualString = driver.findElement(By.xpath(prop.getProperty("success_XPATH"))).getText();
		Assert.assertEquals(actualString, "Done");
		System.out.println("Buy Cryptocurrency successfully validated");
		
		
		driver.findElement(By.xpath(prop.getProperty("success_XPATH"))).click();
	}

	public void sellCryptoCurrency() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-250)", "");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(prop.getProperty("sellCryptoBtn_CSS"))).click();
		driver.findElement(By.xpath(prop.getProperty("chooseCurrency_XPATH"))).click();
		driver.findElement(By.xpath(prop.getProperty("sellAmount_XPATH")))
				.sendKeys(prop.getProperty("sellAmount_TEXT"));
		driver.findElement(By.xpath(prop.getProperty("confirmBtn_XPATH"))).click();
		driver.findElement(By.xpath(prop.getProperty("sellPaymBtn_XPATH"))).click(); 
		System.out.println("User successfully sell cryptocurrency");
	}

	public void sellSuccessMsg() {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String actualString = driver.findElement(By.xpath(prop.getProperty("success_XPATH"))).getText();
		Assert.assertEquals(actualString, "Done");
		System.out.println("Sell Cryptocurrency successfully validated");

	}

}
