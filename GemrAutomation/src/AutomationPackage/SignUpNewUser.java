package AutomationPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpNewUser {
	
	public void startAutomation() {
	
	long currentTime;
	long timePassed;
	long startTime;
	int seconds;
	int minutes;
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ZUser\\Desktop\\Java\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
	WebDriverWait wait10 = new WebDriverWait(driver, 10);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
	AutomationMethods methods = new AutomationMethods();
	
	System.out.println("Starting Iteration.\n");
	startTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
	
	driver.get("https://stage.qa.gemr.com");
	driver.manage().window().maximize();
	
	methods.signUpOnboard(driver, wait10);
	
	}
}
