package demoqa.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DatePicker1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "C://automation//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/date-picker");


		driver.findElement(By.id("datePickerMonthYearInput")).click();
		// 4 | click | css=.react-datepicker__month-select | 
		driver.findElement(By.cssSelector(".react-datepicker__month-select")).click();
		// 5 | select | css=.react-datepicker__month-select | label=September
		{
			WebElement dropdown = driver.findElement(By.cssSelector(".react-datepicker__month-select"));
			dropdown.findElement(By.xpath("//option[. = 'September']")).click();
		}
		// 6 | click | css=.react-datepicker__year-select | 
		driver.findElement(By.cssSelector(".react-datepicker__year-select")).click();
		// 7 | select | css=.react-datepicker__year-select | label=1990
		{
			WebElement dropdown = driver.findElement(By.cssSelector(".react-datepicker__year-select"));
			dropdown.findElement(By.xpath("//option[. = '1990']")).click();
		}
		// 8 | click | css=.react-datepicker__day--012:nth-child(4) | 
		driver.findElement(By.cssSelector(".react-datepicker__day--012:nth-child(4)")).click();
		// 9 | click | id=dateAndTimePickerInput | 
		driver.findElement(By.id("dateAndTimePickerInput")).click();
		// 10 | click | css=.react-datepicker__month-read-view--down-arrow | 
		driver.findElement(By.cssSelector(".react-datepicker__month-read-view--down-arrow")).click();
		// 11 | click | css=.react-datepicker__month-option:nth-child(9) | 
		driver.findElement(By.cssSelector(".react-datepicker__month-option:nth-child(9)")).click();
		// 12 | click | css=.react-datepicker__year-read-view | 
		driver.findElement(By.cssSelector(".react-datepicker__year-read-view")).click();
		// 13 | click | css=.react-datepicker__navigation--years-previous | 
		driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 14 | click | css=.react-datepicker__navigation--years-previous | 
		driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 15 | click | css=.react-datepicker__navigation--years-previous | 
		driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 16 | doubleClick | css=.react-datepicker__navigation--years-previous | 
		{
			WebElement element = driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous"));
			Actions builder = new Actions(driver);
			builder.doubleClick(element).perform();
		}
		// 17 | click | css=.react-datepicker__navigation--years-previous | 
		driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 18 | click | css=.react-datepicker__navigation--years-previous | 
		driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 19 | click | css=.react-datepicker__navigation--years-previous | 
		driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 20 | click | css=.react-datepicker__navigation--years-previous | 
		driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 21 | click | css=.react-datepicker__navigation--years-previous | 
		driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 22 | click | css=.react-datepicker__navigation--years-previous | 
		driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 23 | click | css=.react-datepicker__navigation--years-previous | 
		driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 24 | click | css=.react-datepicker__navigation--years-previous | 
		driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 25 | click | css=.react-datepicker__navigation--years-previous | 
		driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 26 | click | css=.react-datepicker__navigation--years-previous | 
		driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 27 | click | css=.react-datepicker__navigation--years-previous | 
		driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 28 | click | css=.react-datepicker__navigation--years-previous | 
		driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 29 | click | css=.react-datepicker__navigation--years-previous | 
		driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 30 | click | css=.react-datepicker__navigation--years-previous | 
		driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 31 | click | css=.react-datepicker__navigation--years-previous | 
		driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 32 | click | css=.react-datepicker__navigation--years-previous | 
		driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 33 | doubleClick | css=.react-datepicker__navigation--years-previous | 
		{
			WebElement element = driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous"));
			Actions builder = new Actions(driver);
			builder.doubleClick(element).perform();
		}
		// 34 | click | css=.react-datepicker__navigation--years-previous | 
		driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 35 | click | css=.react-datepicker__navigation--years-previous | 
		driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 36 | click | css=.react-datepicker__navigation--years-previous | 
		driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 37 | click | css=.react-datepicker__navigation--years-previous | 
		driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 38 | click | css=.react-datepicker__navigation--years-previous | 
		driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 39 | click | css=.react-datepicker__navigation--years-previous | 
		//driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 40 | click | css=.react-datepicker__navigation--years-previous | 
		//driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 41 | click | css=.react-datepicker__navigation--years-previous | 
		//driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 42 | click | css=.react-datepicker__navigation--years-previous | 
		//driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
		// 43 | click | css=.react-datepicker__year-option:nth-child(12) | 
		driver.findElement(By.cssSelector(".react-datepicker__year-option:nth-child(12)")).click();
		// 44 | click | css=.react-datepicker__day--012 | 
		driver.findElement(By.cssSelector(".react-datepicker__day--012")).click();
		// 45 | click | css=.react-datepicker__time-list-item:nth-child(83) | 
		driver.findElement(By.cssSelector(".react-datepicker__time-list-item:nth-child(83)")).click();
	}
}
