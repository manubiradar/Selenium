package gmeet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JoinClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "C://automation//chromedriver_win32//chromedriver.exe");	
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		//driver.get("https://demoqa.com/automation-practice-form") ;
		//driver.findElement(By.id("firstName")).sendKeys("Manohar");
		//driver.findElement(By.id("lastName")).sendKeys("Biradar");
		//driver.findElement(By.id("userEmail")).sendKeys("manubiradar@gmail.com");
	    //driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();		
		//driver.findElement(By.id("userNumber")).sendKeys("9819431159");
		//driver.findElement(By.id("dateOfBirthInput")).clear();
		//driver.findElement(By.id("dateOfBirthInput")).sendKeys("12 sept 1990");
}

}