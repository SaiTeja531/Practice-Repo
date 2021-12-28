package AmazonFramework.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesforceTest {
	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;

	
	@Before("@Smoke")
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M1076601\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	

	@Given("User navigates to {string}")
	public void user_navigates_to(String string) {
	   driver.get(string);
	}

	@When("User enters login credentials {string} and {string}")
	public void user_enters_login_credentials_and(String string, String string2) {
	    driver.findElement(By.cssSelector("#username")).sendKeys(string);
	    driver.findElement(By.cssSelector("#password")).sendKeys(string2);
	}

	@When("Clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
	    driver.findElement(By.cssSelector("#Login")).click();
	}

	@Then("He should be able to enter the application")
	public void he_should_be_able_to_enter_the_application() {
	   System.out.println("welcome to salesforce");
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	

}
