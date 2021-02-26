import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nawrocj2\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		//footer links
		WebElement driverFooter = driver.findElement(By.id("gf-BIG"));
		System.out.println(driverFooter.findElements(By.tagName("a")).size());
		//footer's first column links
		WebElement driverColumn = driverFooter.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(driverColumn.findElements(By.tagName("a")).size());
		List<WebElement> pages = driverColumn.findElements(By.tagName("a"));
		//click on each link in the column and check if the pages are opening
		for(int i=1; i<pages.size();i++)
		{
			String clickonlinkTab=Keys.chord(Keys.CONTROL, Keys.ENTER);
			pages.get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
		}
		
		//opens all the tabs and get the titles of them
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
	}

}
  