package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWaitDisappears {
	//Explicitwait

	//Explicit wait Disappears

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/disapper.html");

		driver.manage().window().maximize();

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20) );
		WebElement button = driver.findElement(By.id("btn"));

		wait.until(ExpectedConditions.invisibilityOf(button));

		String text = driver.findElement(By.tagName("strong")).getText();
		System.out.println("Text: " + text);

	}

}
