package week4.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/table.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// step 1;to find the table

		WebElement WebTable = driver.findElement(By.id("table_id"));

		// step2: Get all the rows

		List<WebElement> tableRows = WebTable.findElements(By.tagName("tr"));

		// step3: Get the no.of rows in the table

		System.out.println(" The total Number if Rows in the table is: " + tableRows.size());

		// step4: Get the columns in the table

		WebElement FirstRow = tableRows.get(0);

		// step5: Get the no.of columns in the table

		List<WebElement> tableCol = FirstRow.findElements(By.tagName("th"));

		System.out.println(" The total Number if Coulums in the table is: " + tableCol.size());

		// step6:print all the content of the table//create for each to print all
		// contents

		for (WebElement eachRow : tableRows)

		{
			System.out.println(eachRow.getText());
		}

		// step5: print only the 2nd column alone

		for (int i = 1; i < tableRows.size(); i++)

		{
			WebElement row = tableRows.get(i);

			// td is the first row tag name hence using td instead tr

			List<WebElement> col = row.findElements(By.tagName("td"));

			String ColumnText = col.get(1).getText();
			System.out.println(ColumnText);

		}
	}
}