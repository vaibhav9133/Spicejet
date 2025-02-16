
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Aviation {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		// Initialize WebDriver
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']/div[1]")).click();
		driver.findElement(By.xpath("//div[@class='r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2'][text()='From']")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz']//div[contains(text(), 'Vishakhapatnam')]")).click();
//		driver.findElement(By.xpath("//div[@class='r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2'][text()='To']")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe']")));
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe']//div[text()='TEZ']")).click();
		
		String date="March-2025";
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();
		
		Thread.sleep(7000);
		System.out.println(driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088']")).getDomAttribute("data-testid"));
//		if(WebDate.contains(date)){
//			driver.findElement(By.xpath("//div[contains(@class,'r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd')]")).click();
//		}
		
	
		
//		
//		while(true) {
//			String WebDate=driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088']")).getDomAttribute("data-testid");
//			if(WebDate.contains(date)){
//				break;
//			}
//			driver.findElement(By.xpath("//div[contains(@class,'r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd')]")).click();
//		
//		}
		
		//driver.quit();
		
	
	}
}
