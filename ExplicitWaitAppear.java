package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitAppear {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/appear.html");

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// driver.findElement(By.id("btn")); ctrl 2; L

		WebElement button = driver.findElement(By.id("btn"));

		// to appear explicit wait

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("btn"))));

		String text = driver.findElement(By.id("btn")).getText();
		System.out.println(text);
	}

}
