import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nawrocj2\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		WebElement move2 = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(move).build().perform();
		a.moveToElement(move2).click().keyDown(Keys.SHIFT).sendKeys("Kuba").build().perform();
	}
}
