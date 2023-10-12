package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDivisionpopup {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalam\\OneDrive\\Desktop\\Batches\\QCO-SOEJVD\\QCO_SOEJVD_A2\\src\\main\\resources\\chromedriver.exe");
		WebDriverManager.edgedriver().setup();
		// opening chrome browser
		WebDriver driver = new EdgeDriver();
		// maximizing the browser
		driver.manage().window().maximize();
		// implicit statement
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		//address of date
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		driver.findElement(By.xpath("//div[text()='Sep']/../../../..//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 bwoYtA']")).click();

	}

}
