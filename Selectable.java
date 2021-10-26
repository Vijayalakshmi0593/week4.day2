package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/selectable.html");

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));

		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));

		WebElement item6 = driver.findElement(By.xpath("//li[text()='Item 6']"));

		Actions builder = new Actions(driver);

		builder.clickAndHold(item1).moveToElement(item4).release().perform();

		// Select by Keyboard:

		// builder.keyDown(Keys.CONTROL).click(item1).click(item4).click(item6).keyUp(Keys.CONTROL).perform();

	}

}
