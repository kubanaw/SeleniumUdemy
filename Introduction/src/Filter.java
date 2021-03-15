import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nawrocj2\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
		// 1 results
		List<WebElement> fileterdList = veggies.stream().filter(veggie->veggie.getText()
				.contains("Rice")).collect(Collectors.toList()); 
		// 1 results
		Assert.assertEquals(veggies.size(), fileterdList.size());
		//Assert.assertTrue(veggies.equals(fileterdList));
	}

}
