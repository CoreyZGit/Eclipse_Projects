import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
		
		public static void main(String []args) {
			
			System.setProperty("webdriver.chrome.driver", "c:\\Users\\ZUser\\Desktop\\Java\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.youtube.com/watch?v=1APaV2hrpYE");
			driver.manage().window().maximize();
			driver.findElement(By.cssSelector("#movie_player > div.ytp-chrome-bottom > div.ytp-chrome-controls > div.ytp-right-controls > button.ytp-fullscreen-button.ytp-button")).click();
			
	}
			
}		
	
	
	
	
	

