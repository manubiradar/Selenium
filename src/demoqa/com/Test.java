package demoqa.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "C://automation//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		  System.out.println(driver.getTitle());
//		  System.out.println("launching brouser TC11");
//		  driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		  driver.findElement(By.id("user-name")).click();
//		  driver.findElement(By.id("user-name")).clear();
//		  driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		  driver.findElement(By.id("password")).clear();
//		  
//		  driver.findElement(By.id("login-button")).click();
//		  driver.findElement(By.id("react-burger-menu-btn")).click();
//		  Thread.sleep(2000);
//		  driver.findElement(By.id("logout_sidebar_link")).click();
//		  Assert.assertEquals(driver.getTitle(), "Swag Labs");
//		  driver.quit();
		  System.out.println(driver.getTitle());
			 System.out.println("launching browser TC1");
			  driver.findElement(By.id("user-name")).click();
			  driver.findElement(By.id("user-name")).clear();
			  driver.findElement(By.id("user-name")).sendKeys("standard_user");
			  driver.findElement(By.id("password")).click();
			  driver.findElement(By.id("password")).clear();
			  driver.findElement(By.id("password")).sendKeys("secret_sauce");
			  driver.findElement(By.id("login-button")).click();
			  Thread.sleep(3000);
			  System.out.println(driver.getTitle());
		  

	}

}