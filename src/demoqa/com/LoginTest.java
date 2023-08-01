package demoqa.com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class LoginTest {
	public String baseurl="https://www.saucedemo.com/";
	WebDriver driver;
	public String driverPath="C://automation//chromedriver_win32//chromedriver.exe";
	WebDriverWait wait;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();

	}
	@AfterTest
	public void afterTest() {
		System.out.println("TC complete");
		driver.quit();
	}
	@BeforeMethod
	public void beforemethod() {
		wait = new WebDriverWait(driver,10);

	}
	@Test(priority=3)
	public void Login_TC01() {
		System.out.println("launching browser TC1");
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
		driver.findElement(By.id("logout_sidebar_link")).click();
	}
	@Test(priority=4)
	public void Login_TC02() {
		System.out.println("launching browser TC2");
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("secret_sauces");
		driver.findElement(By.id("login-button")).click();
		String error = driver.findElement(By.className("error-message-container")).getText();
		System.out.println(error);
	}
	@Test(priority=5)
	public void Login_TC03() {
		System.out.println("launching browser TC3");
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("standard_users");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String error = driver.findElement(By.className("error-message-container")).getText();
		System.out.println(error);
	}
	@Test(priority=6)
	public void Login_TC04() {
		System.out.println("launching browser TC4");
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("standard_users");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("secret_sauces");
		driver.findElement(By.id("login-button")).click();
		System.out.println(driver.findElement(By.className("error-message-container")).getText());
	}
	@Test(priority=7)
	public void Login_TC05() {
		System.out.println("launching browser TC5");
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		System.out.println(driver.findElement(By.className("error-message-container")).getText());
	}
	@Test(priority=8)
	public void Login_TC06() {
		System.out.println("launching browser TC6");
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
		driver.findElement(By.id("logout_sidebar_link")).click();
	}
	@Test(priority=9)
	public void Login_TC07()  {
		System.out.println("launching browser TC7");
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn")));
		driver.findElement(By.id("react-burger-menu-btn")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
		driver.findElement(By.id("logout_sidebar_link")).click();
	}
	@Test(priority=1)
	public void Login_TC08() {
		System.out.println("launching browser TC8");
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).clear();
		//driver.findElement(By.id("user-name")).sendKeys("");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).clear();
		//driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.id("login-button")).click();
		System.out.println(driver.findElement(By.className("error-message-container")).getText());
	}
	@Test(priority=2)
	public void Login_TC09() {
		System.out.println("launching browser TC9");
		driver.findElement(By.id("user-name")).click(); 
		driver.findElement(By.id("user-name")).clear();
		//driver.findElement(By.id("user-name")).sendKeys("");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		System.out.println(driver.findElement(By.className("error-message-container")).getText());
	}
	@Test(priority=0)
	public void Login_TC10()  {
		System.out.println("launching browser TC10");
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("standard_users");
		//Thread.sleep(20000);
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).clear();
		//driver.findElement(By.id("password")).sendKeys();
		// Thread.sleep(4000);
		driver.findElement(By.id("login-button")).click();
		// Thread.sleep(4000);

		System.out.println(driver.findElement(By.className("error-message-container")).getText());
		// 	 String epicSadfacePassword = driver.findElement(By.xpath("//div[@class='error-message-container error']")).getText();
		// 	 System.out.println(epicSadfacePassword);
	}
}


