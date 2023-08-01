package demoqa.com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class saucedemo {
	public String baseurl="https://www.saucedemo.com/";
	WebDriver driver;
	public String driverPath="C://automation//chromedriver_win32//chromedriver.exe";
	WebElement id,password,login,menu,logout;
	WebDriverWait wait;

	@Test(priority=0)
	public void Login_logout_TC1() {
		System.out.print("Running TC1...");
		id.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		menu = driver.findElement(By.id("react-burger-menu-btn"));
		menu.click();
		logout = driver.findElement(By.id("logout_sidebar_link"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
		logout.click();
		System.out.println("....Compleated TC1");
	}
	@Test(priority=1)
	public void wrong_id_password_TC2() {
		System.out.print("Running TC2...");
		id.click();
		id.clear();
		id.sendKeys("standard_users");
		password.click();
		password.clear();
		password.sendKeys("secret_sauces");
		login.click();
		String error = driver.findElement(By.className("error-message-container")).getText();
		System.out.println("....Compleated TC2");
		System.out.println(error);
	}
	@Test(priority=2)
	public void wrong_id_TC3() {
		System.out.print("Running TC3...");
		id.click();
		id.clear();
		id.sendKeys("standard_users");
		password.click();
		password.clear();
		password.sendKeys("secret_sauce");
		login.click();
		System.out.println("....Compleated TC3");
		String error = driver.findElement(By.className("error-message-container")).getText();
		System.out.println(error);
	}
	@Test(priority=3)
	public void wrong_password_TC4() {
		System.out.print("Running TC4...");
		id.click();
		id.clear();
		id.sendKeys("standard_user");
		password.click();
		password.clear();
		password.sendKeys("secret_sauces");
		login.click();
		System.out.println("....Compleated TC4");
		String error = driver.findElement(By.className("error-message-container")).getText();
		System.out.println(error);
	}
	/*@Test(priority=4)
  public void Logout_TC5() {}
  @Test(priority=5)
  public void Logout_TC6() {}
  @Test(priority=6)
  public void Logout_TC7() {}
  @Test(priority=7)
  public void Logout_TC8() {}
  @Test(priority=8)
  public void Logout_TC9() {}
  @Test(priority=9)
  public void Logout_TC10() {}
  @Test(priority=10)
  public void Logout_TC11() {}*/

	@BeforeMethod
	public void beforeMethod() {
		/*driver = new ChromeDriver();
	  driver.get(baseurl);
	  driver.manage().window().maximize();*/
		id = driver.findElement(By.id("user-name"));
		password = driver.findElement(By.id("password"));
		login = driver.findElement(By.id("login-button"));
		wait = new WebDriverWait(driver, 10);
	}

	@AfterMethod
	public void afterMethod() {
		//driver.close();
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		Assert.assertEquals(driver.getTitle(), "Swag Labs");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("execution compleated");
		driver.quit();
	}

}
