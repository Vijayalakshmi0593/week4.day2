package week4.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
	//drangan drop class name

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/drop.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement Drag = driver.findElement(By.id("draggable"));

		WebElement Drop = driver.findElement(By.id("droppable"));

		Actions builder = new Actions(driver);

		builder.dragAndDrop(Drag, Drop).perform();		
		
		String text = driver.findElement(By.id("droppable")).getText();
		System.out.println(text);

	}

}
