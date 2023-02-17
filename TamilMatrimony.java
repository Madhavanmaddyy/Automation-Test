package week4.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//select[@id='REGISTERED_BY']")).click();
		WebElement element = driver.findElement(By.xpath("//select[@id='REGISTERED_BY']"));
		Select name=new Select(element);
		name.selectByVisibleText("Friend");
		driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("maddy");
		driver.findElement(By.xpath("//input[@id='gendermale']")).click();
		WebElement element1 = driver.findElement(By.xpath("//select[@id='DOBDAY']"));
		Select selectDate = new Select(element1);
        selectDate.selectByVisibleText("2");
		WebElement element2 = driver.findElement(By.xpath("//select[@id='DOBMONTH']"));
		Select selectMonth = new Select(element2);
		selectMonth.selectByVisibleText("Apr");
		WebElement element3 = driver.findElement(By.xpath("//select[@id='DOBYEAR']"));
        Select selectYear = new Select(element3);
		selectYear.selectByVisibleText("2001");
		WebElement element4 = driver.findElement(By.xpath("//select[@id='RELIGION']"));
		Select selectReligion = new Select(element4);
		selectReligion.selectByVisibleText("Hindu");
		WebElement tougue = driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));
		Select selectTougue = new Select(tougue);
		selectTougue.selectByVisibleText("Tamil");
		WebElement findElement5 = driver.findElement(By.xpath("//select[@id='COUNTRY']"));
		Select selectCountry = new Select(findElement5);
		selectCountry.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("6379466331");
		driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("maddy@gmail.com");
		driver.close();
		
		
		
		
		
		
		
	}

}
