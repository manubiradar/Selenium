package demoqa.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateAndTime {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver" , "C://automation//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver", "C://automation//chromedriver_win32//chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/date-picker");
		
		//select the date box
		driver.findElement(By.id("dateAndTimePickerInput")).click(); 

		//select the year drop down
		driver.findElement(By.className("react-datepicker__year-read-view")).click();
		
		//clicking the down scroll button till the year we want to select is visible
		int x = 29;
		while (x>0) {
		    driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[13]")).click();
		    // Click the element
		x--;
		}
		
		
		// selecting the year
		driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[11]")).click();
		
		// selecting the month from the month drop down
		driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div[1]/div[9]")).click();
		
		// selecting the date from date box
		driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[83]")).click();
		
		// selecting the time from time box
		driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[83]")).click();

	

	}
}