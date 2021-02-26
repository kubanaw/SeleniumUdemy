import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nawrocj2\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/"); // hit url on the browser
		//System.out.println(driver.getTitle()); // validate if your Page title is correct
		//System.out.println(driver.getCurrentUrl()); // validate if you are on correct url
		//driver.get("http://yahoo.com");
		//driver.navigate().back();
		driver.findElement(By.id("u_0_h")).click();
		driver.findElement(By.name("email")).sendKeys("Dupa");
		driver.findElement(By.name("pass")).sendKeys("123");
		driver.findElement(By.linkText("Forgot Password?")).click();
		// driver.close();
	
	}

}
