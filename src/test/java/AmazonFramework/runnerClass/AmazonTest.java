package AmazonFramework.runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features={"src\\test\\java\\AmazonFramework\\featureFiles\\test.feature"},
				glue= {"classpath:AmazonFramework.steps", "src\\test\\java\\AmazonFramework\\myHooks\\MyHooks"},
				tags = "@Smoke",
				monochrome=true,
				plugin= {"pretty","html:target/HtmlReports/report1.html"}
				)
public class AmazonTest {

}
