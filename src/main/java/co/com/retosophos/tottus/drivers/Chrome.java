package co.com.retosophos.tottus.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome {
	
	private static WebDriver driver;
	
	public static Chrome web() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/co.com.retosophos.tottus.webdrivers/windows/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito", "--start-maximized", "--disable-infobars");
		driver = new ChromeDriver(options);
		return new Chrome();
	}
	
	public WebDriver withUrl(String url) {
		driver.get(url);
		return driver;
	}

}
