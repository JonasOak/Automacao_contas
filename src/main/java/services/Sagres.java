package services;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import entities.Heart;

public final class Sagres extends Heart {
	
	public Sagres(String userName, String password) {
		super(userName, password);
	}
	
	@Override
	public void login(WebDriver driver, int sum) {
		sum = 1;
		super.login(driver, sum);
	}
	
	public void sagresAccount(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='ctl00$PageContent$LoginPanel$UserName']")).sendKeys(userName);
        driver.findElement(By.id("ctl00_PageContent_LoginPanel_Password")).sendKeys(password);
        
        try {
        	Thread.sleep(2000);
        	new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
        	new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-border"))).click();
        	
        	Thread.sleep(2000);
        	driver.findElement(By.cssSelector("input[name='ctl00$PageContent$LoginPanel$LoginButton']")).click();
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }
        catch (NoSuchElementException e) {
        	System.out.println("can't proceed.");
        }

	}
	
}
