package ParallelRun;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class ParallelScriptRunner {

    private void executeScript(String browserName) {
        WebDriver driver;

        // Set system properties based on the browser
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C://automation//chromedriver_win32//chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C://automation//geckodriver-v0.32.0-win32//geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver","C://automation//edgedriver_win64//msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            throw new IllegalArgumentException("Invalid browser name: " + browserName);
        }

        try {
            // Your script logic goes here
            // ...
        	 	driver.manage().window().maximize();
//        	driver.get("https://www.google.com/");
        		driver.get("https://www.saucedemo.com/");

      		  driver.findElement(By.id("user-name")).sendKeys("standard_user");
      		  driver.findElement(By.id("user-name")).click();
      		  driver.findElement(By.id("password")).sendKeys("secret_sauce");
      		  driver.findElement(By.id("login-button")).click();
      		  driver.findElement(By.id("react-burger-menu-btn")).click();
//      		  Thread.sleep(2000);
      		  driver.findElement(By.id("logout_sidebar_link")).click();
      		  Assert.assertEquals(driver.getTitle(), "Swag Labs");

        } finally {
            driver.quit();
        }
    }

    public void runScriptInParallel() {
        ExecutorService executorService = Executors.newFixedThreadPool(3); // Number of parallel threads

        // Submit tasks for each browser
        executorService.submit(() -> executeScript("chrome"));
        executorService.submit(() -> executeScript("firefox"));
        executorService.submit(() -> executeScript("edge"));

        // Shutdown the executor service
        executorService.shutdown();
    }

    public static void main(String[] args) {
        ParallelScriptRunner obj = new ParallelScriptRunner();
        obj.runScriptInParallel();
    }
}