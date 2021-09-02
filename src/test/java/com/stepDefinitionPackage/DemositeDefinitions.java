package com.stepDefinitionPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.page.LoginPageUnderTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemositeDefinitions {
 
	WebDriver driver;
	String URL ="https://opensource-demo.orangehrmlive.com/index.php/auth/login";
	LoginPageUnderTest objLogin;
	
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(URL);
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String Uname, String pass) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   objLogin = new LoginPageUnderTest(driver);
	   objLogin.Username.sendKeys(Uname);
	   objLogin.Password.sendKeys(pass);
       objLogin.LoginButton.click();
	}

	@Then("^Message displayed Login Successfull$")
	public void message_displayed_Login_Successfull() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("success!");
	}

}
