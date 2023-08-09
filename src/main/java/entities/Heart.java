package entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Heart {

	protected String userName;
	protected String password;

	public Heart() {
	}

	public Heart(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public static WebDriver getChromeDriver(String locale) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--lang=" + locale);
		options.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		return driver;
	}

	public void login(WebDriver driver, int sum) {

		String filePath = "accounts\\credentials.txt";
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

			String line;
			int lineNumber = 1;

			while ((line = reader.readLine()) != null) {
				if (lineNumber == sum) {
					String[] credentials = line.split(",");
					this.userName = credentials[0];
					this.password = credentials[1];
					
					break;
				}
				lineNumber++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
