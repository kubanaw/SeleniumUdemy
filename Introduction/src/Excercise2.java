import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nawrocj2\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		WebElement courses = driver.findElement(By.name("courses"));
		System.out.println(courses.findElements(By.tagName("th")).size());
		System.out.println(courses.findElements(By.tagName("tr")).size());
		List <WebElement> secondRow = driver.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		
		System.out.println(secondRow.get(0).getText());
		System.out.println(secondRow.get(1).getText());
		System.out.println(secondRow.get(2).getText());

		

	}

}
