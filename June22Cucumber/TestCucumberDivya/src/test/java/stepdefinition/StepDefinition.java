package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	
	@Given("Load the URL")
	public void load_the_url() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://adactinhotelapp.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	}
	@Given("Provide the User ID and Passowrd")
	public void provide_the_user_id_and_passowrd() {
	   driver.findElement(By.id("username")).sendKeys("csasikumarmes");
	   driver.findElement(By.id("password")).sendKeys("sqr403");
	   
	}
	@Given("Click the Submit Option")
	public void click_the_submit_option() {
	    driver.findElement(By.id("login")).click();
	}
	@Then("Validate the Page")
	public void validate_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("Click the booking history")
	public void click_the_booking_history() {
	    driver.findElement(By.xpath("//a[contains(text(),'Booked Itinerary')]")).click();
	}
	
	@Given("Load the URL {string}")
	public void load_the_url(String url) {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get(url);
	}
	@Given("Provide the User ID {string} and Passowrd {string}")
	public void provide_the_user_id_and_passowrd(String id, String pass) {
		  driver.findElement(By.id("username")).sendKeys(id);
		   driver.findElement(By.id("password")).sendKeys(pass);
	}

}
