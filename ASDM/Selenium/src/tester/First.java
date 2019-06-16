package tester;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
// toolsQA.com/selenium-webdriver
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "http://www.Shop.DemoQA.com";
		driver.get(URL);
		String pgTitle = driver.getTitle();
		System.out.println("Page Title- "+ pgTitle);
		System.out.println("Page Title Length- "+ pgTitle.length());
		
		String gotURL = driver.getCurrentUrl();
		if (gotURL.equals(URL)) {
			System.out.println("URL matches");
		}
		else {
			System.out.println("URL does not match");
		}
		
		String pgSource = driver.getPageSource();
		//System.out.println("Page Source- "+ pgSource);
		System.out.println("Page Source Length- "+ pgSource.length());
		//System.out.println("Jhala re run");
		driver.close();
		
	}

}
