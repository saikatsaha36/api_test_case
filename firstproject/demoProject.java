package firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoProject {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
//		driver.findElement(By.xpath("//div[@id='carousel-banner-0']//span[@class='fa fa-chevron-right']")).click();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='fas fa-user']")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Saikat");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Saha");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("ssrsaha7@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Sk12345678");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='input-newsletter-no']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='login page']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("ssrsaha7@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Sk12345678");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(3000);
	
		
		
		
		
		
		
//		driver.findElement(By.id("login-button")).click();
		
		
//		Dropdown Code
//		Thread.sleep(3000);
//		WebElement dropdown= driver.findElement(By.id("option"));
//		Thread.sleep(3000);
//		Select selectobject=new Select(dropdown);
//		Thread.sleep(3000);
//		selectobject.selectByIndex(1);
//		Thread.sleep(3000);
//		selectobject.selectByValue("option 3");
//		Thread.sleep(3000);
//		selectobject.selectByVisibleText("Option 2");
//		Thread.sleep(3000);
//		driver.close();
	}
}

