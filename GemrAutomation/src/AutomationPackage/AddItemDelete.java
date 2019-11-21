package AutomationPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddItemDelete {
	
	public void startAutomation(Integer numberImages, Integer itemType, Integer numberClubs, Boolean newCollection, Boolean advancedInfo) {
		
		long timePassed;
		long startTime;
		int seconds;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ZUser\\Desktop\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		WebDriverWait wait10 = new WebDriverWait(driver, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		AutomationMethods methods = new AutomationMethods();
		
		System.out.println("Starting Iteration.\n");
		startTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());	
							
		methods.LogIn(driver);
		methods.addItem(driver, wait10, js, numberImages, itemType, numberClubs, newCollection, advancedInfo);
		methods.deleteItem();
		methods.LogOutQuit(driver);
		
		timePassed = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());	
		seconds = (int)Math.round(timePassed - startTime);
		
		methods.totalTime(seconds);
		
	}
	
	

}