package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import Generic_Libraries.WebDriverUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alter_Popup {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		// opening chrome browser
		WebDriver driver = new EdgeDriver();
		// maximizing the browser
		driver.manage().window().maximize();
		// implicit statement
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/product.php?product=java");
		// address of plus icon
		WebElement plus = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.doubleClick(plus).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@ondblclick='addtocart()']")).click();
		// switching the control
		// Alert al = driver.switchTo().alert();
		WebDriverUtilities utl = new WebDriverUtilities();
		utl.alter(driver);
		// Thread.sleep(3000);
		// System.out.println(al.getText());
		// al.accept();
		// al.dismiss();

	}

}
