package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	static WebDriver driver = TestRunner.driver;
	@Given("user Login Into Adactin Application")
	public void user_login_into_adactin_application() {
		driver.get("https://adactinhotelapp.com/index.php");
	}
	@When("user Enters The Username In The Username Field")
	public void user_enters_the_username_in_the_username_field() {
		driver.findElement(By.id("username")).sendKeys("Admin1122");
	}
	@When("user Enters The Password In The Password Field")
	public void user_enters_the_password_in_the_password_field() {
		driver.findElement(By.id("password")).sendKeys("Bgopi@2109");
		
	}
	@Then("user Clicks On Login Button And It Navigates To Search Hotel Page")
	public void user_clicks_on_login_button_and_it_navigates_to_search_hotel_page() {
	   driver.findElement(By.id("login")).click();
	}


}
