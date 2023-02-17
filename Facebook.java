package week4.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("maddy");
		driver.findElement(By.name("lastname")).sendKeys("v");
		driver.findElement(By.name("reg_email__")).sendKeys("6379466331");
		driver.findElement(By.id("password_step_input")).sendKeys("maddy1234");
		WebElement element = driver.findElement(By.name("birthday_day"));
		Select text=new Select(element);
		text.selectByValue("4");
		WebElement element2 = driver.findElement(By.name("birthday_month"));
		Select text1=new Select(element2);
		text1.selectByIndex(4);
		WebElement element3 = driver.findElement(By.xpath("//select[@id='year']"));
		Select text2=new Select(element3);
		text2.selectByVisibleText("2001");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.close();
		
		
		
		
	}

}
