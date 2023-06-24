package firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/");
//		driver.navigate().to("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
//		driver.findElement(By.id("item_4_title_link")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(3000);
//		driver.findElement(By.id("shopping_cart_container")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("abc");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("xyz");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("1600");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='finish']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("checkout")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("item_4_title_link")).click();	
		/*
		 * driver.findElement(By.id("first-name")).sendKeys("abc"); Thread.sleep(3000);
		 * driver.findElement(By.id("last-name")).sendKeys("xyz"); Thread.sleep(3000);
		 * driver.findElement(By.id("postal-code")).sendKeys("1600");
		 * Thread.sleep(3000); driver.findElement(By.id("continue")).click();
		 * Thread.sleep(3000); driver.findElement(By.id("finish")).click();
		 * Thread.sleep(3000); driver.findElement(By.id("back-to-products")).click();
		 */
		

		
		
		Thread.sleep(3000);
		driver.close();
		
//		Thread.sleep(5000);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
}
