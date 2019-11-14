package AutomationPackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationMethods {
	
	private long currentTime;
	private long timePassed;
	private int seconds;

	public void LogIn(WebDriver driver) {
		
		currentTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());	
		
		driver.get("https://gemr.com");
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
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/form/div/div[1]/input")).sendKeys("NewCollection");
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
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 4000);");
		
		driver.findElement(By.xpath("//*[@id=\"grid-container\"]/div[1]/div[1]/div[2]/div[2]/a[2]")).click();		
		
		wait10.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#x2ProfileBody > div > div:nth-child(2) > div.flexStart.gridColumnContainer > div:nth-child(1) > div:nth-child(1) > div > div > div.margB15.posRel > h2")));		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		
		driver.findElement(By.cssSelector("#x2ProfileBody > div > div:nth-child(2) > div.flexStart.gridColumnContainer > div:nth-child(1) > div:nth-child(1) > div > div > div.margB15.posRel > h2")).click();		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 4000);");

		driver.findElement(By.className("ownerActionCog")).click();
		driver.findElement(By.xpath("//*[@id=\"base-detail-container\"]/div[2]/div[4]/ul/li[1]")).click();
		
		wait10.until(ExpectedConditions.visibilityOfElementLocated(By.className("wizDropdown")));
		
		Select addToCollection = new Select(driver.findElement(By.className("wizDropdown")));
		addToCollection.selectByVisibleText("NewCollection");
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
		String ownedCollectionText = "//*[text()='NewCollection']";
		elementExists(driver, ownedCollectionText, ownedCollectionXpath, js);
			
		driver.findElement(By.xpath("//*[@id=\"profileRightNew\"]/div/div[4]/div[1]/div[1]/div[1]/div/div/div[1]/h2")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
		driver.findElement(By.className("ownerActionCog")).click();
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
		
		driver.findElement(By.xpath("//*[@id=\"base-detail-container\"]/div[2]/div/ul/li[4]")).click();
		
		wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"modals-container\"]/div[2]/div/div[2]/div/form/div/div[2]/div/select")));
		
		Select deleteCollection = new Select(driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div[2]/div/div[2]/div/form/div/div[2]/div/select")));
		deleteCollection.selectByIndex(1);
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
		
	public void campaignAlreadyAuth(WebDriver driver, WebDriverWait wait10, JavascriptExecutor js) {
		
		currentTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		
		wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/button[2]")));
		
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/button[2]")).click();	
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
		
		driver.findElement(By.xpath("//*[@id=\"tooltip\"]/span")).click();
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
	
		Boolean tof = driver.findElements(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/button")).size() > 0;
		
		if(tof) {
			
			driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/button")).click();	
			
		}else {
			
			driver.findElement(By.xpath("//*[@id=\"club2Top\"]/div[2]/button")).click();	
			
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
			
			driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/button")).click();
			
		}
									
		timePassed = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		seconds = (int)Math.round(timePassed - currentTime);
		System.out.println(seconds);
		
	}
	
	public void signUpOnboard(WebDriver driver, WebDriverWait wait10, WebDriverWait wait20, JavascriptExecutor js, int numberInterests, int numberClubs, int numberBCK) {
		
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
		
		wait20.until(ExpectedConditions.elementToBeClickable(By.className("buttonOk")));
		
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
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
		
		driver.findElement(By.xpath("//*[@id=\"pageFour\"]/div/button[1]")).click();		
		
		timePassed = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		seconds = (int)Math.round(timePassed - currentTime);
		System.out.println("On-boarding completed in " + seconds + " seconds.\n");
		
	}
	
	public void allTutorials(WebDriver driver, JavascriptExecutor js, WebDriverWait wait20) {
		
		currentTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());		

		wait20.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tooltip\"]/div/button")));
		
		driver.findElement(By.xpath("//*[@id=\"tooltip\"]/div/button")).click();
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
		
		driver.findElement(By.xpath("//*[@id=\"tooltip\"]/div/button")).click();
				
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
		
		driver.findElement(By.xpath("//*[@id=\"tooltip\"]/div/button")).click();
					
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
		
		driver.findElement(By.xpath("//*[@id=\"club-hub\"]/div/div[2]/div[1]/h4")).click();
		
		wait20.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tooltip\"]/div/button")));
		
		driver.findElement(By.xpath("//*[@id=\"tooltip\"]/div/button")).click();
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
		
		driver.findElement(By.xpath("//*[@id=\"tooltip\"]/div/button")).click();
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
		
		driver.findElement(By.xpath("//*[@id=\"tooltip\"]/div/button")).click();
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
		
		driver.findElement(By.id("navbar-shop")).click();
		
		wait20.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"overlay\"]/div/button[1]")));
		
		driver.findElement(By.xpath("//*[@id=\"overlay\"]/div/button[1]")).click();
		
		timePassed = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		seconds = (int)Math.round(timePassed - currentTime);
		System.out.println("All tutorials completed in " + seconds + " seconds.\n");
		
		
	}
	
	public void deleteAccountQuit(WebDriver driver, WebDriverWait wait10, JavascriptExecutor js) {
		
		currentTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());	
		
		wait10.until(ExpectedConditions.elementToBeClickable(By.id("navbar-profile-dropdown")));
		
		driver.findElement(By.id("navbar-profile-dropdown")).click();
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
		
		driver.findElement(By.xpath("//*[@id=\"x2NavUserText\"]/ul/li[4]/a")).click();
		
		wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"view-container\"]/div/div[1]/div/div/div[2]")));
		
		driver.findElement(By.xpath("//*[@id=\"view-container\"]/div/div[1]/div/div/div[2]")).click();
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
		
		driver.findElement(By.xpath("//*[@id=\"view-container\"]/div/div[2]/div[3]/div/div[2]/div[9]/button")).click();
		
		wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div[2]/div/button[2]")));
		
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div[2]/div/button[2]")).click();
		
		driver.quit();
		
		timePassed = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		seconds = (int)Math.round(timePassed - currentTime);
		System.out.println("Delete account completed in " + seconds + " seconds.\n");
	}
	
	public void addItem(WebDriver driver, WebDriverWait wait10, JavascriptExecutor js, Integer numberImages, Integer itemType, Integer numberClubs, Boolean newCollection, Boolean advancedInfo) {
		
		currentTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		
		wait10.until(ExpectedConditions.visibilityOfElementLocated(By.id("x2NavAdd")));
		
		driver.findElement(By.id("x2NavAdd")).click();
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
		
		driver.findElement(By.xpath("//*[text()='New Item']")).click();		
		
		WebElement uploadImages = driver.findElement(By.xpath("//*[@id=\"sortableContainer\"]/div/div/input"));
		
		while(numberImages > 0) {
			
			System.out.println("Uploading image");
			uploadImages.sendKeys("C:\\Users\\ZUser\\Desktop\\Penguins.jpg");		
			numberImages--;
		
		}
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1500);");
		
		driver.findElement(By.className("input200")).sendKeys("Automated Test Item ;)");
		driver.findElement(By.className("textarea200")).sendKeys("Automated Text Description!");
							
		if(itemType == 1) {
			
			wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/form/div[5]/button")));
			
			driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/form/div[5]/button")).click();
			
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");		
			
		}else if(itemType == 2) {
			
			driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/form/div[2]/div/div[3]/button")).click();
			
			wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/form/div[5]/button")));
			
			driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/form/div[5]/button")).click();
						
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
			
		}else if(itemType == 3) {
			
			driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/form/div[2]/div/div[1]/button")).click();
			wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/form/div[5]/div/div[1]/div[1]")));
			
			for(int i = 1; i < 5; i++) {
			
			driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/form/div[5]/div/div[" + String.valueOf(i) + "]/div[1]")).click();			
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
			driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/form/div[5]/div/div[" + String.valueOf(i) + "]/div[2]/input")).sendKeys("1");				
			
			}
			
			driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/form/div[5]/div/div[4]/div[2]/span")).click();
			
			wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/form/div[6]/button")));
			driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/form/div[6]/button")).click();
			
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
			
		}										
		
		if(newCollection){
		
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
			
			driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/span")).click();		
			
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
			
			driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/form/div/div[1]/input")).sendKeys("AutomatedTestCollection");
			driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/form/div/div[2]/textarea")).sendKeys("AutomatedDescription!!!!!");
			
			wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/form/div/div[5]/button")));
					
			driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/form/div/div[5]/button")).click();
			
		
		}else if(!newCollection) {
			
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
			
			Select addToCollection = new Select(driver.findElement(By.className("wizDropdown")));
			addToCollection.selectByIndex(1);
						
		}		
				
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
		
		while(numberClubs > 0) {
								
			driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[" + String.valueOf(numberClubs) + "]/label/div[1]")).click();			
						
			numberClubs--;
		}
		
		if(advancedInfo) {
			
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
			
			driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div[2]/div/div[1]/div[4]/span")).click();
			
			Select chooseAnInfoCard = new Select(driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/select")));
			chooseAnInfoCard.selectByVisibleText("action-figure");
			
			driver.findElement(By.id("55ad415f28a89f0723967473")).sendKeys("Test");		
			driver.findElement(By.id("55ad415f28a89f0723967474")).sendKeys("Test");
			driver.findElement(By.id("55ad415f28a89f0723967477")).sendKeys("Test");
			driver.findElement(By.id("55ad415f28a89f0723967481")).sendKeys("Test");
			driver.findElement(By.id("55ad415f28a89f0723967489")).sendKeys("10/01/2019");
			driver.findElement(By.id("55ad415f28a89f072396748e")).sendKeys("Test");
			
			driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/input")).sendKeys("https://www.youtube.com/watch?v=pukRYvqqiNw");
			
			for(int i = 0; i < 3; i++) {
			
			driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div[2]/div/div[1]/div[3]/div[3]/div[1]/input")).sendKeys("Test Tag " + String.valueOf(i));
			driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div[2]/div/div[1]/div[3]/div[3]/div[1]/button")).click();
			
			}
		}
		
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div[2]/div/div[2]/button[2]")).click();
		
		wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div/div/div[2]/button[2]")));
		
		driver.findElement(By.xpath("//*[@id=\"modals-container\"]/div/div/div[2]/div/div/div/div/div[2]/button[2]")).click();

		timePassed = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		seconds = (int)Math.round(timePassed - currentTime);
		System.out.println("Delete account completed in " + seconds + " seconds.\n");
		
		
	}
	
	public void verifyEmail(WebDriver driver, WebDriverWait wait10, JavascriptExecutor js) {	
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
		
		driver.navigate().to("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
			
		wait10.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#identifierId")));
		
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("corey@gemr.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Wormtown#722");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
		
		wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div[1]/img")));
		
		WebElement childVerify = driver.findElement(By.xpath("//*[text()='Gemr']"));
		WebElement parentVerify = childVerify.findElement(By.xpath("./.."));
		WebElement grandVerify = parentVerify.findElement(By.xpath("../.."));
		grandVerify.click();
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
		
		driver.findElement(By.xpath("//*[text()='Verify Now']")).click();		
		
		ArrayList<String> windowTabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(windowTabs.get(1));
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
		
		wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tooltip\"]/div/button")));

	}
	
	public void generateCampaign(WebDriver driver, WebDriverWait wait10, JavascriptExecutor js, String landingURL, boolean giveaway, boolean branch, boolean advanced) {
		
		currentTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		
		wait10.until(ExpectedConditions.visibilityOfElementLocated(By.className("avatar65")));
		
		driver.findElement(By.className("avatar65")).click();
		
		wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"x2ProfileBody\"]/div/div[1]/button[3]")));
		
		driver.findElement(By.xpath("//*[@id=\"x2ProfileBody\"]/div/div[1]/button[3]")).click();
		
		wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/form/div[1]/input")));
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/form/div[1]/input")).sendKeys("coreyzdude");		
		driver.findElement(By.xpath("//*[@id=\"app\"]/form/div[2]/input")).sendKeys("Wormtown#722");
		driver.findElement(By.xpath("//*[@id=\"app\"]/form/button")).click();
		
		wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div/button[1]")));
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/button[1]")).click();
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
		
		WebElement inputField = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[1]/input"));
				
		inputField.sendKeys("s56");
		inputField.click();
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
		
		Boolean dropDownPresent = driver.findElements(By.className("drop-down-box")).size() > 0;
		
		if(!dropDownPresent) {
			
			inputField.sendKeys("TestCampaign#1");
			
		}else {
				
			WebElement campaignInput = driver.findElement(By.className("drop-down-box"));
		
			String lastCampaign = campaignInput.getText();
		
			if(lastCampaign.startsWith("s56TestCampaign#")) {
			
				Integer campaignNum = Integer.valueOf(lastCampaign.substring(16));
				campaignNum++;
			
				inputField.clear();
				inputField.sendKeys("TestCampaign#" + campaignNum);
			
			}else {
					
				inputField.sendKeys("TestCampaign#1");
	
			}
		
		}
				
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[2]/input")).sendKeys("source");		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[3]/input")).sendKeys("medium");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[4]/input")).sendKeys(landingURL);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[5]/button")).click();
						
		WebElement uploadImages = driver.findElement(By.className("file-input"));
		System.out.println("Uploading image");
		
		uploadImages.sendKeys("C:\\Users\\ZUser\\Desktop\\Penguins.jpg");	
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[5]/div/div/div[2]/input")).sendKeys("Campaign Modal");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[5]/div/div/div[3]/textarea")).sendKeys("Automated Message");	
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[5]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[6]/button")).click();
		
		if(giveaway) {
			
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[6]/div/div/div/div[1]/div/input")).sendKeys("AutomatedGiveaway#");
			
			Boolean lastGiveawayPresent = driver.findElements(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[6]/div/div/div[1]/div[2]/div[1]/button")).size() > 0;
			
			if(!lastGiveawayPresent) {
				
				driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[6]/div/div/button")).click();
				
				js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
				
				driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div/form/div[1]/input")).sendKeys("AutomatedGiveaway#1");
				
			}else {
						
				WebElement lastGiveaway = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[6]/div/div/div[1]/div[2]/div[1]/button"));
				String giveawayText = lastGiveaway.getText();
				Integer giveawayNum = Integer.valueOf(giveawayText.substring(18));
				giveawayNum++;			
			
				driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[6]/div/div/button")).click();
			
				js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
			
				driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div/form/div[1]/input")).sendKeys("AutomatedGiveaway#" + giveawayNum);
			
			}
			
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div/form/div[2]/div[2]/div/div[2]/button")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div/form/div[3]/div[1]/button")).click();
			
			WebElement additionalCriteria = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div/form/button[1]"));
			js.executeScript("arguments[0].scrollIntoView();", additionalCriteria);	
			
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div/form/div[3]/div[2]/input")).sendKeys("Minimum Criteria");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div/form/div[3]/div[3]/textarea")).sendKeys("Minimum Criteria Message");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div/form/div[3]/div[4]/input")).sendKeys(";)");
			additionalCriteria.click();
			
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
			
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div/form/div[4]/div[1]/div[2]/div/div[4]/button")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div/form/div[4]/div[2]/div[1]/button")).click();

			WebElement saveButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div/form/button[2]"));
			js.executeScript("arguments[0].scrollIntoView();", saveButton);	
			
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div/form/div[4]/div[2]/div[2]/input")).sendKeys("Additional Criteria");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div/form/div[4]/div[2]/div[3]/textarea")).sendKeys("Additonal Criteria Message");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div/form/div[4]/div[2]/div[4]/input")).sendKeys(";)");
			saveButton.click();
			
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
			
		}else {
			
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[6]/div/div/div[1]/div[2]/div[1]/button")).click();				
			
		}
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[6]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[7]/button")).click();
		
		landingURL = landingURL.replaceAll("https://gemr.com/club/", "");		
		landingURL = landingURL.substring(17, landingURL.length() - 1);		
		landingURL = landingURL.replace("-"," ");		
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[7]/div/div[2]/div/input")).sendKeys(landingURL);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[7]/div/div[1]/input")).click();
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
		
		driver.findElement(By.xpath("//*[text() = '" + landingURL + "']")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[7]/button")).click();
		
		WebElement saveButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/button"));		
		
		if(branch) {
			
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[8]/button")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[8]/div/div[1]/input")).click();
			
			byte[] array = new byte[7];
			new Random().nextBytes(array);
			String customVanity = new String(array, Charset.forName("UTF-8"));
			customVanity = "VANITY-" + customVanity;
			
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[8]/div/div[2]/input")).sendKeys(customVanity);
			
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");
			
			driver.findElement(By.className("dark-grey-button")).click();
			
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
			
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[8]/div/div[4]/input")).sendKeys("Open Graph Title");
			
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
			
			driver.findElement(By.className("textarea-box")).sendKeys("Open Graph Description");
			
			WebElement branchOGButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[8]/div/div[6]/button"));			
			js.executeScript("arguments[0].scrollIntoView();", branchOGButton);			
			branchOGButton.click();		
			
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
			
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[8]/div/div[1]/input")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[8]/button")).click();
			
		}
		
		if(advanced) {
			
			js.executeScript("arguments[0].scrollIntoView();", saveButton);	
			
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[9]/button")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[9]/div/div[1]/div/input")).sendKeys("00/00/0000");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[9]/div/div[2]/div/input")).sendKeys("00/00/0000");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[9]/div/div[3]/input")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[9]/div/div[4]/textarea")).sendKeys("Automated Modal Message");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[9]/div/div[5]/input")).sendKeys("10");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/div[9]/button")).click();
			
		}
		
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
		saveButton.click();
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
		driver.close();

		timePassed = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		seconds = (int)Math.round(timePassed - currentTime);
		System.out.println("Campaign creation completed in " + seconds + " seconds.\n");
		
	}
	
	public void totalTime(int seconds) {
		
		int minutes;
		
		if(seconds > 60) {
			
			minutes = seconds / 60;
			seconds = seconds % 60;
			
			if(seconds <= 9) {
				
				System.out.printf("Iteration completed in %d:0%d.\n", minutes, seconds);
				
			}else {
				
				System.out.printf("Iteration completed in %d:%d.\n", minutes, seconds);
				
			}			
			
		}else {
		
			System.out.println("Iteration completed in " + seconds + " seconds.\n");
		
		}
			
	}
	
	
	
}
