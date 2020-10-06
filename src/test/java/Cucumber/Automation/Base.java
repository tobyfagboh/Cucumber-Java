package Cucumber.Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;

	public static Properties config = new Properties();
	public static Properties OR = new Properties();

	public static WebDriver getDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/java/Cucumber/Automation/global.properties");
		prop.load(fis);
		

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("implicit.wait")), TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));

		return driver;

	}


	public void setup() {

		if (driver == null) {

			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "/src/test/java/Cucumber/Automation/OR.properties");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			try {
				OR.load(fis);
				// log.debug("Config file loaded !!!");
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
