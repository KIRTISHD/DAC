package tester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "http://www.Shop.DemoQA.com";
		driver.get(URL);
		
		//driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		//*[@id='nav-menu-item-cart']/a
		driver.findElement(By.xpath(".//*[@id='nav-menu-item-cart']/a")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().to(URL);

		driver.navigate().refresh();
		
		driver.close();
	}

}
