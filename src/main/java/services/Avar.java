package services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import entities.Heart;

public final class Avar extends Heart {

	public Avar(String userName, String password) {
		super(userName, password);
	}
	
	@Override
	public void login(WebDriver driver, int sum) {
		sum = 2;
		super.login(driver, sum);
	}
	
	public void avarAccount(WebDriver driver) {
		WebElement linkElement = driver.findElement(By.xpath("//a[contains(text(), 'Acessar')]"));
		linkElement.click();
		
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("loginbtn")).click();

	}
	
}
