package application;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import entities.Heart;
import services.Avar;
import services.GitHub;
import services.Sagres;

public final class Program {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Heart.getChromeDriver("pt");
	    
	    String sagres = "http://cairu.tecnotrends.com.br/PortalSagres/Acesso.aspx";
	    String avar = "http://online.cairu.br/moodle/";
	    String gitHub = "https://github.com/login";
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    Set<String> handles = driver.getWindowHandles();
	    String novaAba;
	    
	    try {
	    
	    GitHub gitHubUser = new GitHub(null, null);
	    driver.get(gitHub);
	    gitHubUser.login(driver, 0);
	    gitHubUser.gitHubAccount(driver);
	    
	    }
	    catch (WebDriverException e) {
	    	e.printStackTrace();
	    	System.out.println("Out of line.");
	    }
	    
	    try {
	    	
        js.executeScript("window.open('', '_blank');");
        handles = driver.getWindowHandles();
        novaAba = (String) handles.toArray()[handles.size() - 1];
        
        driver.switchTo().window(novaAba);
        
	    Avar avarUser = new Avar(null, null);
        driver.get(avar);
        avarUser.login(driver, 0);
        avarUser.avarAccount(driver);
        
	    }
	    catch (WebDriverException e) {
	    	e.printStackTrace();
	    	System.out.println("Out of line.");
	    }
	    
	    try {
	    
        js.executeScript("window.open('', '_blank');");
        handles = driver.getWindowHandles();
        novaAba = (String) handles.toArray()[handles.size() - 1];
        
        driver.switchTo().window(novaAba);
        
        Sagres sagresUser = new Sagres(null, null);
        driver.get(sagres);
        sagresUser.login(driver, 0);
        sagresUser.sagresAccount(driver);
        
	    }
	    catch (WebDriverException e) {
	    	e.printStackTrace();
	    	System.out.println("Out of line.");
	    }
        
        
	}

}
