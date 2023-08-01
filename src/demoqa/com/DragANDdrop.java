package demoqa.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragANDdrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://automation//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		
		
		WebElement rs5000add = driver.findElement(By.xpath("//*[@id='fourth']/a"));
		WebElement bank = driver.findElement(By.xpath("//*[@id='credit2']/a"));
		WebElement sales = driver.findElement(By.xpath("//*[@id='credit1']/a"));
		
		
		WebElement debit_acc = driver.findElement(By.xpath("//*[@id='bank']/li"));
		WebElement debit_amt = driver.findElement(By.xpath("//*[@id='amt7']/li"));
		WebElement credit_acc = driver.findElement(By.xpath("//*[@id='loan']/li"));
		WebElement credit_amt = driver.findElement(By.xpath("//*[@id='amt8']/li"));
		Actions act = new Actions(driver);
				
		act.dragAndDrop(bank, debit_acc).perform();
		act.dragAndDrop(rs5000add, debit_amt).perform();
		act.dragAndDrop(sales, credit_acc).perform();
		act.dragAndDrop(rs5000add, credit_amt).perform();
		
	}

}
