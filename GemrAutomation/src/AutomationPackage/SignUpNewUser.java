package AutomationPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpNewUser {
	
	public void startAutomation(int numberInterests, int numberClubs, int numberBCK) {
	
	long timePassed;
	long startTime;
	int seconds;
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ZUser\\Desktop\\Java\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
	WebDriverWait wait10 = new WebDriverWait(driver, 10);
	WebDriverWait wait20 = new WebDriverWait(driver, 20);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
	AutomationMethods methods = new AutomationMethods();
	
	System.out.println("Starting Iteration.\n");
	startTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
	
	driver.get("https://gemr.com");
	driver.manage().window().maximize();
	
	methods.signUpOnboard(driver, wait10, wait20, js, numberInterests, numberClubs, numberBCK);
	methods.verifyEmail(driver, wait10, js);
	methods.allTutorials(driver, js, wait20);
	methods.deleteAccountQuit(driver, wait10, js);
	
	timePassed = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());	
	seconds = (int)Math.round(timePassed - startTime);
	
	methods.totalTime(seconds);	
	
	}
}
