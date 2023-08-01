package demoqa.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) {
//		WebDriver driver = null;		
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*") ;
//		driver = new ChromeDriver(co);
		System.setProperty("webdriver.chrome.driver" , "C://automation//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click();
		Alert popup1 = driver.switchTo().alert();
		popup1.accept();
		
		driver.findElement(By.id("timerAlertButton")).click();
		WebDriverWait wait = new WebDriverWait(driver,6);
		wait.until(ExpectedConditions.alertIsPresent());
		//Thread.sleep(6000 );
		Alert popup2 = driver.switchTo().alert();
		popup2.accept();
		
		driver.findElement(By.id("confirmButton")).click();
		Alert popup3 = driver.switchTo().alert();
		popup3.dismiss();
		
		driver.findElement(By.id("promtButton")).click();
		Alert popup4 = driver.switchTo().alert();
		popup4.sendKeys("Manohar_Biradar");
		popup4.accept();
		
		driver.quit();
		

	}

}
