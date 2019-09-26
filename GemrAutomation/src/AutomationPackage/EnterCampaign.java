package AutomationPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterCampaign {
	
	public void startAutomation(String campaignLink) {
		
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
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		
		currentTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());						
		methods.LogIn(driver);
		timePassed = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		seconds = (int)Math.round(timePassed - currentTime);		
		System.out.println("Log in completed in " + seconds + " seconds.\n");
		
		driver.navigate().to(campaignLink);
		
		currentTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());						
		methods.campaignAlreadyAuth(driver, wait10);
		timePassed = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		seconds = (int)Math.round(timePassed - currentTime);		
		System.out.println("Log in completed in " + seconds + " seconds.\n");
	}
	
	

}
