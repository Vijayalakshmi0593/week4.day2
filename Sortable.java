package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/sortable/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Actions Builder = new Actions(driver);

		driver.switchTo().frame(0);

		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));

		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));

		Point location = item5.getLocation();

		int x = location.getX();
		int y = location.getY();

		Builder.dragAndDropBy(item1, x, y).perform();

	}
}
