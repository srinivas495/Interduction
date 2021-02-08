import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffXpathCssRegularExp {

	public static void main(String[] args) throws InterruptedException 
	{
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath +"\\drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		
		
		/*driver.findElement(By.xpath("")).sendKeys("Reglur Exp with xpath UserName");
		driver.findElement(By.xpath("")).sendKeys("Reglur Exp with xpath Password");
		driver.findElement(By.xpath("")).click();
		*/
		
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Reglur Exp with CSS Password");
		driver.findElement(By.cssSelector("input#password")).sendKeys("112512");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
	}

}
