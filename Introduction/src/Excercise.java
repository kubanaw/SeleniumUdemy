import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nawrocj2\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption2")).click();
		String option = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println(option);
		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		Select abc = new Select(dropDown);
		abc.selectByVisibleText(option);
		driver.findElement(By.cssSelector("#name")).sendKeys(option);
		driver.findElement(By.id("alertbtn")).click();
		String alert = driver.switchTo().alert().getText();
		if(alert.contains(option))
		{
			System.out.println("Good");
		}
		else
		{
			System.out.println("Not Good");

		}
		 
	}

}
