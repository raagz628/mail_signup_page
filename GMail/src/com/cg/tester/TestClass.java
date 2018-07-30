package com.cg.tester;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/JavaWorkSpaceSTS/GMail/WebContent/WEB-INF/lib/page1.html");
		
		WebElement fname=driver.findElement(By.name("firstname"));
		fname.sendKeys("Raghavendiran");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement lname=driver.findElement(By.name("lastname"));
		lname.sendKeys("Venkataramanan");

		WebElement mob=driver.findElement(By.name("mobileNumber"));
		mob.sendKeys("9600045352");
		
		WebElement uname=driver.findElement(By.name("username"));
		uname.sendKeys("raagz628");
		WebElement pass=driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[2]/input"));
		pass.sendKeys("baymax");
		WebElement rpass=driver.findElement(By.xpath("/html/body/table/tbody/tr[6]/td[2]/input"));
		rpass.sendKeys("baymax");
		WebElement country=driver.findElement(By.name("country"));
		Select select=new Select(country);
		select.selectByValue("India");
		List<WebElement> gender=driver.findElements(By.name("gender"));
		gender.get(1).click();
		WebElement check=driver.findElement(By.name("conditions"));
		check.click();
		Thread.sleep(1000);
		WebElement create=driver.findElement(By.name("create"));
		create.click();
		
	
	}
	
}
