 package demoqa.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "C://automation//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/date-picker");
		
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		
		Select month = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		month.selectByIndex(8);
		 
		Select year = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		year.selectByVisibleText("1990");
		
		driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[4]")).click();
		
		
		driver.findElement(By.id("dateAndTimePickerInput")).click();
		Select month1 = new Select(driver.findElement(By.className("react-datepicker__month-read-view--down-arrow")));
		month1.selectByIndex(8);
	    
	    Select year1 = new Select(driver.findElement(By.cssSelector(".react-datepicker__year-read-view--down-arrow")));
		year1.selectByVisibleText("1990");
		
	    driver.findElement(By.cssSelector(".react-datepicker__year-option:nth-child(12)")).click();
	    driver.findElement(By.cssSelector(".react-datepicker__day--012")).click();
        
	}


}
