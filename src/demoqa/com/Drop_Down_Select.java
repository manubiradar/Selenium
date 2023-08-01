package demoqa.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Select {

	public static void main(String[] args) {
//		HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME);
		System.setProperty("webdriver.chrome.driver", "C://automation//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", "C://automation//geckodriver-v0.32.0-win32//geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.edge.driver","C://automation//edgedriver_win64//msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		Select custom = new Select(driver.findElement(By.name("custom")));
		custom.selectByVisibleText("submenu");*/

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
		driver.get("https://demoqa.com/select-menu");
		
//		Select one = new Select(driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")));
//		one.selectByVisibleText("A root option");
		
//	    driver.findElement(By.cssSelector(".css-1pahdxg-control .css-1wa3eu0-placeholder")).click();
//	    driver.findElement(By.id("react-select-2-option-3")).click();
		
//	    driver.findElement(By.cssSelector(".css-1gtu0rj-indicatorContainer > .css-19bqh2r")).click();
//	    driver.findElement(By.id("react-select-2-option-3")).click();
//	    
//	    driver.findElement(By.cssSelector(".css-1gtu0rj-indicatorContainer")).click();
//	    driver.findElement(By.id("react-select-3-option-0-4")).click();
//	    
//	    driver.findElement(By.id("react-select-4-option-1")).click();
	    
//	    Select multiple1 = new Select(driver.findElement(By.className(" css-1wa3eu0-placeholder")));
//		driver.findElement(By.cssSelector(".css-1gtu0rj-indicatorContainer path")).click();
//	    driver.findElement(By.id("react-select-4-option-2")).click();
//	    driver.findElement(By.id("react-select-4-option-2")).click();
//	    driver.findElement(By.id("react-select-4-option-0")).click();
//	    multiple1.selectByIndex(0);
//		multiple1.selectByIndex(1);
//		multiple1.selectByIndex(2);
//		multiple1.selectByIndex(3);
		
		Select olds = new Select(driver.findElement(By.id("oldSelectMenu")));
		olds.selectByValue("1");
		//olds.selectByIndex(3);
		//olds.selectByVisibleText("Voilet");
		
		Select multiple = new Select(driver.findElement(By.id("cars")));
		multiple.selectByIndex(0);
		multiple.selectByIndex(1);
		multiple.selectByIndex(2);
		multiple.selectByIndex(3);
		
		
		driver.quit();
	}
}
