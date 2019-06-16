package tester;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://www.facebook.com/";
		driver.get(URL);
		
		//first name
		String fname = "K";
		driver.findElement(By.id("u_0_l")).sendKeys(fname);
		
		//last name
		String lname = "D";
		driver.findElement(By.id("u_0_n")).sendKeys(lname);
		
		//mobile
		//System.out.println("pedhe vatnar chal re");
		String add = "4204204269";
		//driver.findElement(By.xpath("//input[@placeholder='Mobile number or email address']")).sendKeys(add);
		//driver.findElement(By.name("inputtext _58mg _5dba _2ph-")).sendKeys(add);
		driver.findElement(By.id("u_0_q")).sendKeys(add);
		
		
		//password
		String pass = "add2SD$$";
		driver.findElement(By.id("u_0_x")).sendKeys(pass);
		
		
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("10");
		
		//System.out.println("mai aaya");
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Jun");

		//System.out.println("Tu aaja");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1994");
		
		//gender
		List<WebElement> gender = driver.findElements(By.name("sex"));
		gender.get(1).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		//System.out.println("EK bungla bane nyara");
		System.out.println("Khayala Car, Bhuila Bhar; Ani Galat Adkavala aahe DSLR --- Donald Tatya");
		
	}

}
