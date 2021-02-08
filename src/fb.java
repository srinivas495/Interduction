import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath +"\\drivers\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Hit URL on the browser
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("srinivasasfdkask");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
	/*
	 * Write Xpath Syntax 

		//tagName[@attribute='value']
		 * input[id='add-to-cart-button']
		//button[@data-testid='royal_login_button']

		Validate Xpath useing insprect console
		$x("xpath") + hit Enter
		$x("//tagName[@attribute='value']")
		$x("//button[@data-testid='royal_login_button']")
	 * 
	 * 
	 * 
	 */

		
	}

}
