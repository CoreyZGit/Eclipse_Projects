package AutomationPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationMethods {
	
	private long currentTime;
	private long timePassed;
	private int seconds;

	public void LogIn(WebDriver driver) {
		
		currentTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());	
		
		driver.get("https://stage.qa.gemr.com");
		driver.manage().window().maximize();		
		driver.findElement(By.cssSelector("#landingNavBarContainer > div > div > ul > div > li.pointed.inline.landingLogIn")).click();		
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div/div[2]/form/div/div[4]/div[1]/div[2]/input")).sendKeys("coreyzdude");
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div/div[2]/form/div/div[4]/div[2]/div[2]/input")).sendKeys("Wormtown#722");
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div/div[2]/form/div/div[4]/div[3]/button")).click();	
		
		timePassed = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		seconds = (int)Math.round(timePassed - currentTime);		
		System.out.println("Log in completed in " + seconds + " seconds.\n");		
		
	}
	
	public void CreateCollection(WebDriver driver, WebDriverWait wait10, JavascriptExecutor js) {
		
		currentTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());	
		
		wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"user-status\"]/form/div[1]/div[3]/span")));
		
		driver.findElement(By.xpath("//*[@id=\"user-status\"]/form/div[1]/div[3]/span")).click();		
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/form/div/div[1]/input")).sendKeys("AutomatedTestCollection");
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/form/div/div[2]/textarea")).sendKeys("AutomatedDescription!!!!!");
		
		wait10.until(ExpectedConditions.visibilityOfElementLocated(By.className("x2ClubCheck-text")));
		
		WebElement clubCell = driver.findElement(By.className("x2ClubCheck-text"));
		js.executeScript("arguments[0].click()", clubCell);
				
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/form/div/div[5]/button")).click();
		
		timePassed = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		seconds = (int)Math.round(timePassed - currentTime);
		System.out.println("Create collection completed in " + seconds + " seconds.\n");		
		
	}
	
	public void AddItemToCollection(WebDriver driver, WebDriverWait wait10, JavascriptExecutor js){
		
		currentTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());	
		
		wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"grid-container\"]/div[1]/div[1]/div[2]/div[2]/a[2]")));	
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");
		
		driver.findElement(By.xpath("//*[@id=\"grid-container\"]/div[1]/div[1]/div[2]/div[2]/a[2]")).click();		
		
		wait10.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#x2ProfileBody > div > div:nth-child(2) > div.flexStart.gridColumnContainer > div:nth-child(1) > div:nth-child(1) > div > div > div.margB15.posRel > h2")));		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		
		driver.findElement(By.cssSelector("#x2ProfileBody > div > div:nth-child(2) > div.flexStart.gridColumnContainer > div:nth-child(1) > div:nth-child(1) > div > div > div.margB15.posRel > h2")).click();		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");

		driver.findElement(By.className("ownerActionCog")).click();
		driver.findElement(By.xpath("//*[@id=\"base-detail-container\"]/div[2]/div[4]/ul/li[1]")).click();
		
		wait10.until(ExpectedConditions.visibilityOfElementLocated(By.className("wizDropdown")));
		
		Select addToCollection = new Select(driver.findElement(By.className("wizDropdown")));
		addToCollection.selectByVisibleText("AutomatedTestCollection");
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div[2]/div/div[2]/div/div[2]/div/div[2]/button[3]")).click();
		
		wait10.until(ExpectedConditions.elementToBeClickable(By.className("close-item")));
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 4000);");
		
		driver.findElement(By.className("close-item")).click();
		
		timePassed = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		seconds = (int)Math.round(timePassed - currentTime);
		System.out.println("Adding item to collection completed in " + seconds + " seconds.\n");
			
	}
	
	public void NavigateToClubDeleteCollection(WebDriver driver, WebDriverWait wait10, JavascriptExecutor js) {
		
		currentTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());	
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");
		
		driver.findElement(By.xpath("//*[@id=\"navbar-clubs\"]/a/li")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-clubs\"]/div/div[2]/div[1]/div[2]/a[1]/div[2]")).click();
		
		wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"club-tabs\"]/ul/li[2]/a")));
		
		driver.findElement(By.xpath("//*[@id=\"club-tabs\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"profileRightNew\"]/div/div[2]/ul/li[1]/a")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
			
		String ownedCollectionXpath = "//*[@id=\"profileRightNew\"]/div/div[4]/div[1]/div[1]/div[1]/div/div[2]";
		String ownedCollectionText = "//*[text()='AutomatedTestCollection']";
		elementExists(driver, ownedCollectionText, ownedCollectionXpath, js);
			
		driver.findElement(By.xpath("//*[@id=\"profileRightNew\"]/div/div[4]/div[1]/div[1]/div[1]/div/div/div[1]/h2")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
		driver.findElement(By.className("ownerActionCog")).click();
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");
		
		driver.findElement(By.xpath("//*[@id=\"base-detail-container\"]/div[2]/div/ul/li[4]")).click();
		
		wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"modals-container\"]/div[2]/div/div[2]/div/form/div/div[2]/div/select")));
		
		Select deleteCollection = new Select(driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div[2]/div/div[2]/div/form/div/div[2]/div/select")));
		deleteCollection.selectByVisibleText("default");
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div[2]/div/div[2]/div/form/div/div[5]/button[2]")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		driver.findElement(By.cssSelector("#modals-container > div:nth-child(3) > div > div.v--modal-box.v--modal.v--dialog > div > div.x2ModalTitleBox > svg")).click();
		
		timePassed = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		seconds = (int)Math.round(timePassed - currentTime);
		System.out.println("Navigating to club and deleting collection completed in " + seconds + " seconds.\n");
		
		
		
	}
				
	public void LogOutQuit(WebDriver driver){
		
		currentTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
		driver.findElement(By.xpath("//*[@id=\"x2NavUserText\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"x2NavUserText\"]/ul/li[5]/a")).click();
		
		driver.close();
		
		timePassed = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		seconds = (int)Math.round(timePassed - currentTime);
		System.out.println("Log out completed in " + seconds + " seconds.\n");
		
		
	}
	
	public void elementExists(WebDriver driver, String elementText, String element, JavascriptExecutor js){
		
		Boolean tof = driver.findElements(By.xpath(elementText)).size() > 0;
		
		if(tof) {
			
			driver.findElement(By.xpath(element)).click();		
			
		}else {
						
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
			driver.navigate().refresh();
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
			
			elementExists(driver, elementText, element, js);
			
		}
			
			
		
		
	}
		
	public void campaignAlreadyAuth(WebDriver driver, WebDriverWait wait10) {
		
		currentTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		
		wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/button[2]")));
		
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/button[2]")).click();				
		driver.findElement(By.xpath("//*[@id=\"club2Top\"]/div[3]/button")).click();
		
		timePassed = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		seconds = (int)Math.round(timePassed - currentTime);
		System.out.println(seconds);
		
	}
	
	public void signUpOnboard(WebDriver driver, WebDriverWait wait10, JavascriptExecutor js, Actions actions, int numberInterests, int numberClubs, int numberBCK) {
		
		currentTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		
		driver.findElement(By.xpath("//*[@id=\"landingNavBarContainer\"]/div/div/ul/div/li[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div/div/div[2]/form/div/div[4]/div[1]/div[2]/input")).sendKeys("automatedaccount1234");
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div/div/div[2]/form/div/div[4]/div[2]/div[2]/input")).sendKeys("corey+automated@gemr.com");
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div/div/div[2]/form/div/div[4]/div[3]/div[2]/input")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div/div/div[2]/form/div/div[4]/div[4]/div[2]/input")).sendKeys("123456");
		
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div/div/div[2]/form/div/div[4]/div[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div/div[2]/div[2]/div[1]/input")).click();
		
		wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/button[2]")));
		
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/button[2]")).click();
		
		wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div/div/div[2]/form/div/div[4]/div[6]/button")));
		
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div/div/div[2]/form/div/div[4]/div[6]/button")).click();
		
		wait10.until(ExpectedConditions.elementToBeClickable(By.className("buttonOk")));
		
		driver.findElement(By.className("buttonOk")).click();
		
		wait10.until(ExpectedConditions.elementToBeClickable(By.className("gridSkrim")));
		
		driver.findElement(By.className("gridSkrim")).click();
		
		wait10.until(ExpectedConditions.elementToBeClickable(By.className("selectionButton")));
		
		driver.findElement(By.className("selectionButton")).click();
		
		while(numberInterests > 0) {
		
			driver.findElement(By.className("gridSkrim")).click();
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
			numberInterests--;
		
		}
		
		driver.findElement(By.xpath("//*[@id=\"pageOne\"]/div/div[1]/button")).click();
		
		wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"c1_0\"]")));
		
		while(numberClubs > 0) {
			
			driver.findElement(By.xpath("//*[@id=\"c1_0\"]")).click();
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
			numberClubs--;
				
		}
		
		driver.findElement(By.xpath("//*[@id=\"pageTwo\"]/div/div[1]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"pageOne\"]/div/div[1]/button")).click();
		
		wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"pageTwo\"]/div/div[1]/button[2]")));
		
		driver.findElement(By.xpath("//*[@id=\"pageTwo\"]/div/div[1]/button[2]")).click();
		
		wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"pageThree\"]/div/div[2]/div[1]/div[3]/div[2]/button")));
		
		driver.findElement(By.xpath("//*[@id=\"pageThree\"]/div/div[2]/div[1]/div[3]/div[2]/button")).click();
		
		wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"pageThree\"]/div/div[2]/div[1]/div[3]/div[2]/button")));
		
		driver.findElement(By.xpath("//*[@id=\"pageThree\"]/div/div[2]/div[1]/div[3]/div[2]/button")).click();
		
		if(numberBCK > 0) {
		switch(numberBCK) {
		
		case 1:
			
			driver.findElement(By.xpath("//*[@id=\"pageThree\"]/div/div[2]/div[1]/div[3]/div[2]/button")).click();
			driver.findElement(By.xpath("//*[@id=\"pageThree\"]/div/div[1]/button[1]")).click();
			
			break;

		case 2:	
		
			for(int i = 1; i < 3; i++) {
				
						
				driver.findElement(By.xpath("//*[@id=\"pageThree\"]/div/div[2]/div[" + String.valueOf(i) + "]/div[3]/div[2]/button")).click();
				js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
			
				}
			
			driver.findElement(By.xpath("//*[@id=\"pageThree\"]/div/div[1]/button[1]")).click();
			
			break;
						
		case 3:
			
			for(int i = 1; i < 4; i++) {
				
				
				driver.findElement(By.xpath("//*[@id=\"pageThree\"]/div/div[2]/div[" + String.valueOf(i) + "]/div[3]/div[2]/button")).click();
				js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
				
				}

			driver.findElement(By.xpath("//*[@id=\"pageThree\"]/div/div[1]/button[1]")).click();
			
			break;
			
		case 4:
			
			for(int i = 1; i < 5; i++) {
				
				
				driver.findElement(By.xpath("//*[@id=\"pageThree\"]/div/div[2]/div[" + String.valueOf(i) + "]/div[3]/div[2]/button")).click();
				js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
				
				}

			driver.findElement(By.xpath("//*[@id=\"pageThree\"]/div/div[1]/button[1]")).click();
			
			break;
			
		case 5:
			
			for(int i = 1; i < 6; i++) {
				
				
				driver.findElement(By.xpath("//*[@id=\"pageThree\"]/div/div[2]/div[" + String.valueOf(i) + "]/div[3]/div[2]/button")).click();
				js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
				
				}

			driver.findElement(By.xpath("//*[@id=\"pageThree\"]/div/div[1]/button[1]")).click();
			
			break;
			
		case 6:	
			
			for(int i = 1; i < 7; i++) {
				
				
				driver.findElement(By.xpath("//*[@id=\"pageThree\"]/div/div[2]/div[" + String.valueOf(i) + "]/div[3]/div[2]/button")).click();
				js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
				
				}

			driver.findElement(By.xpath("//*[@id=\"pageThree\"]/div/div[1]/button[1]")).click();
			
			break;
			
		}
		
	
	}else {
		
		driver.findElement(By.xpath("//*[@id=\"pageThree\"]/div/div[1]/button[1]")).click();
				
	}
		
		wait10.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#pageTwo > div > div.flexStart.gridOffset.mobOpt > button.x2Button.clear")));
		
		driver.findElement(By.cssSelector("#pageTwo > div > div.flexStart.gridOffset.mobOpt > button.x2Button.clear")).click();
		
		wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"pageOne\"]/div/div[1]/button")));
		
		driver.findElement(By.xpath("//*[@id=\"pageOne\"]/div/div[1]/button")).click();
		
		wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"pageTwo\"]/div/div[1]/button[2]")));
		
		driver.findElement(By.xpath("//*[@id=\"pageTwo\"]/div/div[1]/button[2]")).click();

		wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"pageThree\"]/div/div[1]/button[2]")));
		
		driver.findElement(By.xpath("//*[@id=\"pageThree\"]/div/div[1]/button[2]")).click();
		
		wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"pageFour\"]/div/button[1]")));
		
		driver.findElement(By.xpath("//*[@id=\"pageFour\"]/div/div[2]/div/form/div[2]/textarea")).sendKeys("Automated account description.");
		driver.findElement(By.xpath("//*[@id=\"pageFour\"]/div/button[1]")).click();
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 10000);");
		
		timePassed = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		seconds = (int)Math.round(timePassed - currentTime);
		System.out.println("On-boarding completed in " + seconds + " seconds.\n");
		
	}
	
	
	
}
