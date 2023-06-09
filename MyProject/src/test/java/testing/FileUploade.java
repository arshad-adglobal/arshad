package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploade {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\AGL\\Desktop\\one.png");
		driver.findElement(By.id("file-submit")).submit();
		
		if(driver.getPageSource().contains("File Uploaded!")) {
			System.out.println("file uploaded");
		}
		else{
				System.out.println("file not uploaded");
			}
		
		
		//driver.quit();

	}

}
