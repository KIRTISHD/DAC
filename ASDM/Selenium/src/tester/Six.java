package tester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Six {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		Select cont = new Select(driver.findElement(By.id("continents")));
		cont.selectByIndex(1);
		Thread.sleep(2000);
		
		cont.selectByVisibleText("Africa");
		Thread.sleep(2000);
		
		
		
		
		//System.out.println("Sabse bada Rupaiya");

	}

}
