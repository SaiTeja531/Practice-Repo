package AmazonFramework.steps;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;
	


	@Given("I access webdriveruniversity.com")
	public void i_access_webdriveruniversity_com() {
		driver.get("https://www.webdriveruniversity.com");

	}

	@When("I click on login portal")
	public void i_click_on_login_portal() {
		WebElement login = driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		js.executeScript("arguments[0].scrollIntoView();", login);
		js.executeScript("arguments[0].click();", login);

	}

	@When("I enter a user name")
	public void i_enter_a_user_name(DataTable username) {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		it.next();
		driver.switchTo().window(it.next());
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#text")));
		js.executeScript("arguments[0].click();", ele);
		List<List<String>> user=username.cells();
		ele.sendKeys(user.get(0).get(0));
		ele.sendKeys(user.get(0).get(0));
		
	}

	@When("I enter a valid password")
	public void i_enter_a_valid_password() {
		WebElement pass = (WebElement) js.executeScript("return document.getElementById('password');");
		js.executeScript("arguments[0].click()", pass);
		pass.sendKeys("sadineni");
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		js.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("#login-button")));
	}

	@Then("I should be presented with a succesful validation alert")
	public void i_should_be_presented_with_a_succesful_validation_alert() {
		System.out.println(driver.switchTo().alert().getText());
	}
	
}
