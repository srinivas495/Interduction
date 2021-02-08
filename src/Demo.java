import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath +"\\drivers\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Hit URL on the browser
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("srinivas");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		driver.findElement(By.linkText("Forgotten password?")).click();
		
	/*
		// Validate if your page title is correct 
		System.out.println(driver.getTitle());
		
		//Validate if your are landed on correct URL
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		driver.get("http://www.yahoo.com/");
		
		//driver.navigate().back();
		//driver.navigate().forward();
		driver.close(); // it closes current browser
		//driver.quit();  // it closes all the browser opened by selenium script
 		
		driver.findElement(By.name("")).sendKeys("123");
		Select dp = new Select(driver.findElement(By.id("")));
		dp.selectByIndex(0);
		dp.deselectByVisibleText("Sri");
		dp.selectByValue("12");
		
		driver.findElement(By.xpath("xpth")).click();
		*/
		
	}

}
