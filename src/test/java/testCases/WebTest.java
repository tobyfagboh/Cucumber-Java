package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import Cucumber.Automation.Base;

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
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div/div[2]/ul/li[1]/input")).sendKeys("1");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div/div[2]/ul/li[2]/input")).sendKeys("2");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div/div[2]/ul/li[3]/input")).sendKeys("3");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div/div[2]/ul/li[4]/input")).sendKeys("4");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div/div[2]/ul/li[5]/input")).sendKeys("5");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div/div[2]/ul/li[6]/input")).sendKeys("6");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div/button")).click();
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
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String actualString = driver.findElement(By.xpath(prop.getProperty("success_XPATH"))).getText();
		Assert.assertEquals(actualString, "Done");
		System.out.println("Buy Cryptocurrency successfully validated");
		driver.findElement(By.xpath(prop.getProperty("success_XPATH"))).click();
	}

	public void sellCryptoCurrency() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-250)", "");
        
//        Actions act =  new Actions(driver);
//        act.moveToElement(driver.findElement(By.xpath(prop.getProperty("sellCryptoBtn_XPATH")))).click();
//		System.out.println("Sell Cryptocurrency clicked");

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
