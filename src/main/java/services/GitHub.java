package services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import entities.Heart;

public class GitHub extends Heart {

	public GitHub(String userName, String password) {
		super(userName, password);
	}
	
	@Override
	public void login(WebDriver driver, int sum) {
		sum = 3;
		super.login(driver, sum);
	}
	
	public void gitHubAccount(WebDriver driver) {
		driver.findElement(By.id("login_field")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='commit']")).click();
	}
	
}
