package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;


public class TestBase {

	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR  = new Properties();
	public static FileInputStream fis;
	public static WebDriverWait wait;
	public static String browser;
	
	@Before
	public void setUp () {
		
		if (driver==null) {
			
			try {
				fis = new FileInputStream (System.getProperty("user.dir") + "/src/test/resources/properties/Config.properties");
				System.out.println("System Path :: " + System.getProperty("user.dir") + "/src/test/resources/excel/testdata.xlsx");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				config.load(fis);
				//log.debug("Config file loaded !!!");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				fis = new FileInputStream (System.getProperty("user.dir") + "/src/test/resources/properties/OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				OR.load(fis);
				//log.debug("Config file loaded !!!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//Parameterizing build browser 
			if(System.getenv("browser")!=null && System.getenv("browser").isEmpty()) {
				
				browser = System.getenv("browser");
				
			}else {
				
				browser = config.getProperty("browser");
				
			}
			
			config.setProperty("browser", browser);
				
			
			
			if(config.getProperty("browser").equals("firefox")) {
				
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/test/resources/executables/geckodriver.exe");
				driver = new FirefoxDriver();
				//log.debug("Firefox launched !!!");
			 }else if (config.getProperty("browser").equals("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver");
				driver = new ChromeDriver();
				//log.debug("Chrome Launched !!!");
			}else if (config.getProperty("browser").equals("ie")) {
				
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/src/test/resources/executables/iedriver.exe");
				driver = new InternetExplorerDriver();
			}
		
			driver.get(config.getProperty("testsiteurl"));
			//log.debug("Navigated to : " +config.getProperty("testsiteurl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
		}
		
		
	}
	
	
	
	public boolean isElementPresent(By by) {
		
		try {
			
			driver.findElement(by);
			return true;
			
		}catch(NoSuchElementException e) {
			
			return false;
			
		}
		
	}
	
	
	
	@After
	public void tearDown () {
		
		if(driver!=null) {
		driver.quit();
		

		}
	}}