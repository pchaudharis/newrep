package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googleSearch {
	WebDriver driver;
	
	@Given("I am on the Google search page")
	public void i_am_on_the_google_search_page() {
	    driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	    
	}

	@When("I search for {string}")
	public void i_search_for(String keyword) {
	    driver.findElement(By.name("q")).sendKeys(keyword,Keys.ENTER);
	}

	@Then("the page title should start with {string}")
	public void the_page_title_should_start_with(String string) {
		System.out.println("TITLE="+driver.getTitle().toLowerCase());
	}

}
