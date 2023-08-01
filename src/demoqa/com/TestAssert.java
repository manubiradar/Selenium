package demoqa.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class TestAssert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://automation//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		SoftAssert softAssert = new SoftAssert();
		driver.navigate().to("http://www.iviewlogic.in/");
		String getActualTitle = driver.getTitle();
		System.out.println(getActualTitle);

		softAssert.assertEquals(getActualTitle, "I View Logic","First soft assert failed");
		softAssert.assertNotEquals(getActualTitle, "iViewLogic","Second soft assert failed");
		softAssert.assertNull(getActualTitle,"Third soft assert failed" ); 
		softAssert.assertNotNull(getActualTitle,"Fourth soft assert failed");
		softAssert.assertTrue(getActualTitle.equals("I View Logic"), "Fifth soft assert failed");
		softAssert.assertFalse(getActualTitle.equals("iViewLogic"), "Sixth soft assert failed");

		System.out.println(driver.getCurrentUrl());
		driver.close();
		softAssert.assertAll();
//		System.out.println(driver.getCurrentUrl());
//		driver.close();
	}

}