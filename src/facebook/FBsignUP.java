package facebook;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class FBsignUP {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://automation//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");

		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Facebook – log in or sign up";
	    Assert.assertEquals(ExpectedTitle, ActualTitle);
		Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Facebook – log in or sign up");
		assertTrue(verifyTitle);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("manu");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("bira");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("manu@bira.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("manu@bira.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("automation");
		
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("12");
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Sep");
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1990");
		
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		//driver.quit();


	}

}
