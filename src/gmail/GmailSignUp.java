package gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSignUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://automation//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[@class='mobile-tablet-only']/following-sibling::span)[2]")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("manu");
		driver.findElement(By.id("lastName")).sendKeys("bira");
		driver.findElement(By.id("username")).sendKeys("mbiviewtestid");
		driver.findElement(By.name("Passwd")).sendKeys("biramanu12A.");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("biramanu12A.");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
