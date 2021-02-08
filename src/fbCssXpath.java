import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbCssXpath {

	public static void main(String[] args) 
	{
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath +"\\drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		//   Write Xpath Syntax 
		//   //tagName[@attribute='value']
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("my own xpath");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("my own xpathpassword");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
		//   Write Css Syntax 
		//   tagName[attribute='value']
		//   tagName#id
		//   tagName.classname
		
				
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("my own CSS");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("my own CSSpassword");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		

	}

}
