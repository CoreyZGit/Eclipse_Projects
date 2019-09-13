package SeleniumAutomations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumAutomations {
		

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ZUser\\Desktop\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		WebDriverWait wait8 = new WebDriverWait(driver, 8);
		
		final long startTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());	
		System.out.println("Starting Automation.\n");
		
		LogIn(driver);
		long timePassed = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		float seconds = timePassed - startTime;
		System.out.println("Log in completed in " + seconds + " seconds.\n");
		
		CreateCollection(driver, wait8);
		timePassed = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		seconds = timePassed - startTime;
		System.out.println("Create collection completed in " + seconds + " seconds.\n");
		
		AddItemToCollection(driver, wait8);	
		timePassed = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		seconds = timePassed - startTime;
		System.out.println("Adding item to collection completed in " + seconds + " seconds.\n");
		
		NavigateToClub(driver, wait8);
		timePassed = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		seconds = timePassed - startTime;
		System.out.println("Navigating to club completed in " + seconds + " seconds.\n");
		
	}
	
	public static void LogIn(WebDriver driver) {
					
		driver.get("https://stage.qa.gemr.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#landingNavBarContainer > div > div > ul > div > li.pointed.inline.landingLogIn")).click();		
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div/div[2]/form/div/div[4]/div[1]/div[2]/input")).sendKeys("coreyzdude");
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div/div[2]/form/div/div[4]/div[2]/div[2]/input")).sendKeys("Wormtown#722");
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div/div[2]/form/div/div[4]/div[3]/button")).click();	
	}
	
	public static void CreateCollection(WebDriver driver, WebDriverWait wait8) {
		
		wait8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"user-status\"]/form/div[1]/div[3]/span")));
		
		driver.findElement(By.xpath("//*[@id=\"user-status\"]/form/div[1]/div[3]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/form/div/div[1]/input")).sendKeys("AutomatedTestCollection");
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/form/div/div[2]/textarea")).sendKeys("AutomatedDescription!!!!!");
		driver.findElement(By.className("clubTileBottom")).click();		
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/form/div/div[5]/button")).click();
		
		
	}
	
	public static void AddItemToCollection(WebDriver driver, WebDriverWait wait8){
		
		wait8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"grid-container\"]/div[1]/div[1]/div[2]/div[2]/a[2]")));	
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		
		driver.findElement(By.xpath("//*[@id=\"grid-container\"]/div[1]/div[1]/div[2]/div[2]/a[2]")).click();		
		
		wait8.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#x2ProfileBody > div > div:nth-child(2) > div.flexStart.gridColumnContainer > div:nth-child(1) > div:nth-child(1) > div > div > div.margB15.posRel > h2")));		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		
		driver.findElement(By.cssSelector("#x2ProfileBody > div > div:nth-child(2) > div.flexStart.gridColumnContainer > div:nth-child(1) > div:nth-child(1) > div > div > div.margB15.posRel > h2")).click();		
		
		wait8.until(ExpectedConditions.visibilityOfElementLocated(By.className("ownerActionCog")));
		
		driver.findElement(By.className("ownerActionCog")).click();
		driver.findElement(By.xpath("//*[@id=\"base-detail-container\"]/div[2]/div[4]/ul/li[1]")).click();
		
		wait8.until(ExpectedConditions.visibilityOfElementLocated(By.className("wizDropdown")));
		
		Select addToCollection = new Select(driver.findElement(By.className("wizDropdown")));
		addToCollection.selectByVisibleText("AutomatedTestCollection");
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div[2]/div/div[2]/div/div[2]/div/div[2]/button[3]")).click();
		
		wait8.until(ExpectedConditions.elementToBeClickable(By.className("close-item")));
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.className("close-item")).click();
		
			
	}
	
	public static void NavigateToClub(WebDriver driver, WebDriverWait wait8) {
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"navbar-clubs\"]/a/li")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-clubs\"]/div/div[2]/div[1]/div[2]/a[1]/div[2]")).click();
		
		wait8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"club-tabs\"]/ul/li[2]/a")));
		
		driver.findElement(By.xpath("//*[@id=\\\"club-tabs\\\"]/ul/li[2]/a")).click();
		driver.findElement(By.className("nuxt-link-active")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
		driver.findElement(By.xpath("//*[@id=\"profileRightNew\"]/div/div[4]/div[1]/div[1]/div[1]/div/div[2]/div[1]/h2")).click();
		
		
	}
	
}

