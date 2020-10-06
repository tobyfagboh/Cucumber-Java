package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import cucumber.api.junit.Cucumber;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.Automation.Base;
import testCases.WebTest;




@RunWith(Cucumber.class)
public class stepDefination {
	
	WebTest webTest = new WebTest();
	
	WebDriver driver;

	@Given("^User is on YellowCard landing page$")
	public void user_is_on_yellowcard_landing_page() throws Throwable {
		driver = Base.getDriver();
		
		System.out.println("navigated to login url");
	}

	@When("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password() throws Throwable {
		
		webTest.loginTest();
		
	}
	
	@When("^User enters otp$")
	public void user_enters_otp() throws Throwable {
		
		webTest.insertOtp();
		
	}
	
	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		
		webTest.validateDashBoard();
	}
	
//	@Given("^User is on Buy Cryptocurrency page$")
//    public void user_is_on_buy_cryptocurrency_page() throws Throwable {
//		System.out.println("Dashboard page");
//    }

	@When("^User clicks on buy Cryptocurrency, select currency, choose payment method, enter amount and click confirm$")
    public void user_clicks_on_buy_cryptocurrency_select_currency_choose_payment_method_enter_amount_and_click_confirm() throws Throwable {

		webTest.buyCryptoCurrency();
		
    }

    @Then("^Success message is recieved$")
    public void success_message_is_recieved() throws Throwable {

    	webTest.BuySuccessMsg();
    	
    }
    
    @When("^User clicks on sell Cryptocurrency and successfully sell$")
    public void user_clicks_on_sell_cryptocurrency_and_successfully_sell() throws Throwable {

    	webTest.sellCryptoCurrency();
    	
    }

    @Then("^A Success message is recieved$")
    public void a_success_message_is_recieved() throws Throwable {
        
    	webTest.sellSuccessMsg();
    	
    }
}