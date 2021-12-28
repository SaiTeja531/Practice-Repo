package AmazonFramework.myHooks;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;

public class MyHooks {
	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;

	@After
	public void mama() {
		System.out.println("Mama Mia");
	}
	
	
	

}
