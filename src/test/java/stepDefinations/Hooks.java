package stepDefinations;

import Cucumber.Automation.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base{

	@Before("@WebTest")
	public void beforeWebvaldiation() {
		System.out.println("Before Web  hook");
	}

	@After("@WebTest")
	public void AfterWebvaldiation() {
		//driver.close();
		System.out.println("  After Web before hook");
	}
}
