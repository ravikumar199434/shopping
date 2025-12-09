package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageobject.LoginWebElement;

public class LoginClass 
{
	public WebDriver driver;
	public LoginWebElement l;
	@Given("user open chrome browser")
	public void user_open_chrome_browser() 
	{
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   l=new LoginWebElement(driver);
	}

	@When("user open url {string}")
	public void user_open_url(String url) 
	{
	   driver.get(url);
	}

	@When("enter username {string} and password as {string}")
	public void enter_username_and_password_as(String user, String pass) 
	{
	   l.getUsername(user);
	   l.getPassword(pass);
	}

	@When("click on submit button")
	public void click_on_submit_button() 
	{
	   l.clickSubmit();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String Exptitle) 
	{
	  String actitle=driver.getTitle();
	  Assert.assertEquals(Exptitle, actitle);
	}

}
