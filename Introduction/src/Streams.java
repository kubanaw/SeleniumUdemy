import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nawrocj2\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//capture all elements into list
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
		//capture text of all webElements into new (original) list
		List<String> originalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		//capture on the original list of step 3 -> sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		//compare original list with sorted list
		Assert.assertTrue(originalList.equals(sortedList));
		
		List<String> price;
		// scan the name column with getText -> Beans -> print the price of the Rice
		do
		{
		List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
		price = rows.stream().filter(s -> s.getText().contains("Rice"))
				.map(s -> getPriceVeggie(s)).collect(Collectors.toList());
		price.forEach(a -> System.out.println(a));
		if(price.size()<1)
		{
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		} while(price.size()<1);		
	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
