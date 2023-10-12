package Basic_Programming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Camera_Interview {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		// opens the empty browser
		WebDriver driver = new EdgeDriver();

		// for maximizng
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// to open the browser
		//driver.get("https://www.amazon.in/s?k=camera&crid=C2EMYHZQBQSF&sprefix=camera%2Caps%2C208&ref=nb_sb_noss_1");
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("camera");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		for(int i=1;i<=5;i++) {
			WebElement name = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])["+i+"]"));
		WebElement value = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])["+i+"]/../../../../../..//span[@class='a-price-whole']"));
			System.out.println(name.getText()+":"+value.getText());
		}

	}

}
