package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^User is already on Login Page$")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.automationtesting.in/");
	   
	}

	@When("^Title of login page is Free CRM$")
	public void title_of_login_page_is_free_crm() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Automation Demo Site", title);
	}

	@Then("^user enters username$")
	public void user_enters_username() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jay@96@gmail.com");
		driver.findElement(By.xpath("//img[@id='enterimg']")).click();
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//img[@id='enterimg']")).click();
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Automation Demo Site", title);
	}
	
	
}
