import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2eTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nawrocj2\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='DEL']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

		{

			System.out.println("its disabled");

			Assert.assertTrue(true);

		}

		else

		{

			Assert.assertTrue(false);

		}

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);

		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));

		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(5);
		System.out.println(dropdown.getFirstSelectedOption().getText());

		/*
		 * driver.findElement(By.id("divpaxinfo")).click();
		 * 
		 * Thread.sleep(2000L);
		 * 
		 * driver.findElement(By.cssSelector(
		 * "#ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"
		 * )).click(); // div[id='divpaxOptions'] option[value='5']
		 * driver.findElement(By.
		 * cssSelector("div[id='divpaxOptions'] option[value='5'] ")).click();
		 */

		/*
		 * for(int i=1;i<5;i++)
		 * 
		 * {
		 * 
		 * driver.findElement(By.id("hrefIncAdt")).click();
		 * 
		 * }
		 * 
		 */ // functionality has been changed on the website for picking the number of
			// adults

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "6 Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		// driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$btn_FindFlights']")).click();

		// driver.findElement(By.xpath("//input[@value='Search']")).click();

		// driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();

	}
}
