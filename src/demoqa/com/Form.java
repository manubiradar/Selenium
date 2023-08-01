package demoqa.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "C://automation//chromedriver_win32//chromedriver.exe");	
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form") ;
		driver.findElement(By.id("firstName")).sendKeys("Manohar");
		driver.findElement(By.id("lastName")).sendKeys("Biradar");
		driver.findElement(By.id("userEmail")).sendKeys("manubiradar@gmail.com");
	    driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();		
		driver.findElement(By.id("userNumber")).sendKeys("9819431159");
		//driver.findElement(By.id("dateOfBirthInput")).clear();
		//driver.findElement(By.id("dateOfBirthInput")).sendKeys("12 sept 1990");
		driver.findElement(By.id("subjectsInput")).sendKeys("Automation, Manual");
	    //driver.findElement(By.xpath("//label[contains(text(),'Sports')]")).click();
		//driver.findElement(By.xpath("//label[contains(text(),'Reading')]")).click();
		//driver.findElement(By.xpath("//label[contains(text(),'Music')]")).click();
		//driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']")).click();
		//driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']")).click();
		//driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']")).click();
		driver.findElement(By.id("hobbies-checkbox-1")).click();
		
		Select state = new Select(driver.findElement(By.id("state")));
		state.selectByVisibleText("NCR");
		
		Select city = new Select(driver.findElement(By.id("city")));
		city.selectByVisibleText("Delhi");
		
		//driver.findElement(By.id("uploadPicture")).click();
		

		
		/*driver.get("https://www.amazon.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		 js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("desktop-4")));*/

			

}
}			
