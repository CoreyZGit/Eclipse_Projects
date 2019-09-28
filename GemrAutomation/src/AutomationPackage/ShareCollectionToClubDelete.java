package AutomationPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShareCollectionToClubDelete {			
		
		public void startAutomation() {
				
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
							
		methods.LogIn(driver);

		methods.CreateCollection(driver, wait10, js);

		methods.AddItemToCollection(driver, wait10, js);	
		
		methods.NavigateToClubDeleteCollection(driver, wait10, js);

		methods.LogOutQuit(driver);
		
		timePassed = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());	
		seconds = (int)Math.round(timePassed - startTime);
		
		if(seconds > 60) {
			
			minutes = seconds / 60;
			seconds = seconds % 60;
			
			System.out.printf("Iteration completed in %d:%d.\n", minutes, seconds);
			
		}else {
		
			System.out.println("Iteration completed in " + seconds + " seconds.\n");
		
		}	
		
}
				
		
}