package tester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fourth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String URL="http://toolsqa.com/automation-practice-form/";
		driver.get(URL);
		
		driver.findElement(By.name("firstname")).sendKeys("K");
		driver.findElement(By.name("lastname")).sendKeys("D");
		
		driver.findElement(By.id("submit")).click();
		
		driver.close();

	}

}
