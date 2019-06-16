package tester;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fifth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		List<WebElement> lSex = driver.findElements(By.name("sex"));
		boolean bSex = false;
		
		bSex = lSex.get(0).isSelected();
		
		if (bSex == true) {
			lSex.get(1).click();
		}
		else {
			lSex.get(0).click();
		}
		
		driver.findElement(By.id("exp-2")).click();
		
		List<WebElement> pro = driver.findElements(By.name("profession"));
		
		int size = pro.size();
		
		for (int i =0; i< size ; i++) {
			if (pro.get(i).getAttribute("value").equals("Automation Tester")) {
				pro.get(i).click();
				break;
			}
		}
		/*
		List<WebElement> auto = driver.findElements(By.name("tool"));
		
		for(int i = 0; i< auto.size() ; i++ ) {
			if (auto.get(i).getAttribute("value").equals("Selenium IDE")) {
				auto.get(i).click();
				break;
			}
		}
		
		*/
		
		WebElement chkbox = driver.findElement((By.cssSelector("#tool-1")));
		chkbox.click();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//System.out.println("Khali bali");
		driver.close();
	}

}
