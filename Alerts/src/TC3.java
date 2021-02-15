import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		
		Select adult = new Select (driver.findElement(By.id("Adults"))); 
		adult.selectByVisibleText("7");
		
		Select children = new Select (driver.findElement(By.id("Childrens"))); 
		children.selectByVisibleText("2");
		
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[1]/td[7]/a")).click();
		
		driver.findElement(By.xpath("//a[@title='More search options']")).click();

		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("cuba");

		driver.findElement(By.id("SearchBtn")).click();

		//error message

		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		
		
	}

}
