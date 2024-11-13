package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdefinition {
	 WebDriver driver = null;
	
	@Given("Launch the Url")
	public void launch_the_url() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://adactinhotelapp.com/");
	    Thread.sleep(2000);
	}
	
	@Given("Pass the Value to the username")
	public void pass_the_value_to_the_username() throws InterruptedException {
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("casikumarmes");
	    Thread.sleep(2000);
	}
	
	@Given("Pass the Value to the Password Field")
	public void pass_the_value_to_the_password_field() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("A6QUOM");
	    Thread.sleep(2000);
	}
	
	@Then("Click the Login")
	public void click_the_login() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='login']")).click();
	    Thread.sleep(2000);
	    driver.quit();
	}

}
