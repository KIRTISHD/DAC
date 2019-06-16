package tester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {
	
	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		String URL = "https://www.toolsqa.com/automation-practice-switch-windows/";
		driver.get(URL);
		
		driver.findElement(By.id("button1")).click();
		//System.out.println("Dursa pan chalala");
		driver.close();
	}

}
