package week4.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UiBank {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://uibank.uipath.com/register-account");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("maddy");
		driver.findElement(By.xpath("//select[@id='title']")).click();
		driver.findElement(By.xpath("//option[text()='Mr']")).click();
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("v");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("dhoni");
		driver.findElement(By.xpath("//select[@id='sex']")).click();
		driver.findElement(By.xpath("//option[text()='Male']")).click();
		WebElement element = driver.findElement(By.xpath("//select[@id='employmentStatus']"));
	    Select text=new Select(element);
	    text.selectByVisibleText("Unemployed");
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("02-04-2002");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("madhavan");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("maddy@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("maddy333");
		driver.close();
		
		
		
		
		
	}

}
