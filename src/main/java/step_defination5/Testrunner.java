package step_defination5;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testrunner {

	
	public static  WebDriver driver;

	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\cucumber project\\com.cucumber_practice5\\src\\main\\java\\resourse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://localhost:8080/TestMeApp");
	}

	@When("User Navigater to LogIn Page")
	public void user_Navigater_to_LogIn_Page() {
		driver.findElement(By.linkText("SignIn")).click();
	   
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("Login")).click();
	  
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
		WebElement SignOut = driver.findElement(By.linkText("SignOut"));
		assertTrue(SignOut.isDisplayed());
		SignOut.click();
	}
	
}
