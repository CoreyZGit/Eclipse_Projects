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
		
		LogIn(driver);
		CreateCollection(driver);
		AddItemToCollection(driver, wait8);					
	}
	
	public static void LogIn(WebDriver driver) {
					
		driver.get("https://stage.qa.gemr.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#landingNavBarContainer > div > div > ul > div > li.pointed.inline.landingLogIn")).click();		
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div/div[2]/form/div/div[4]/div[1]/div[2]/input")).sendKeys("coreyzdude");
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div/div[2]/form/div/div[4]/div[2]/div[2]/input")).sendKeys("Wormtown#722");
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div/div[2]/form/div/div[4]/div[3]/button")).click();	
	}
	
	public static void CreateCollection(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);	
		
		driver.findElement(By.xpath("//*[@id=\"user-status\"]/form/div[1]/div[3]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/form/div/div[1]/input")).sendKeys("AutomatedTestCollection");
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/form/div/div[2]/textarea")).sendKeys("AutomatedDescription!!!!!");
		driver.findElement(By.className("clubTileBottom")).click();		
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/form/div/div[5]/button")).click();
		
		
	}
	
	public static void AddItemToCollection(WebDriver driver, WebDriverWait wait8){
		
		wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"grid-container\"]/div[1]/div[1]/div[2]/div[2]/a[2]")));
		
		driver.findElement(By.xpath("//*[@id=\"grid-container\"]/div[1]/div[1]/div[2]/div[2]/a[2]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Select gearIcon = new Select(driver.findElement(By.className("ownerActionCog")));
		gearIcon.selectByValue("Edit Item");
		
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		
		
	}
	
}

