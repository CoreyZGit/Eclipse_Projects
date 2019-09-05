package SeleniumAutomations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddItem {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ZUser\\Desktop\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		WebDriverWait wait10 = new WebDriverWait(driver, 10);
		
		driver.get("https://stage.qa.gemr.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#landingNavBarContainer > div > div > ul > div > li.pointed.inline.landingLogIn")).click();		
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div/div[2]/form/div/div[4]/div[1]/div[2]/input")).sendKeys("coreyzdude");
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div/div[2]/form/div/div[4]/div[2]/div[2]/input")).sendKeys("Wormtown#722");
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div/div[2]/form/div/div[4]/div[3]/button")).click();

		wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"x2NavAdd\"]/span[2]"))).click();
		wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"x2NavAdd\"]/ul/li[1]/a"))).click();
				
		wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"sortableContainer\"]/div/div/div/svg")));		
		WebElement uploadElement = driver.findElement(By.xpath("//*[@id=\"sortableContainer\"]/div/div/div/svg"));
		uploadElement.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures");
		
	}
	
	
}
