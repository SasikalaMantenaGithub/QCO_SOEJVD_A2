package Basic_Programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class preceding_sibling {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		// opens the empty browser
		WebDriver driver = new EdgeDriver();

		// for maximizng
		driver.manage().window().maximize();

		// to open the browser
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[text()='New Releases']/preceding-sibling::a[@data-csa-c-content-id='nav_cs_gb']")).click();


	}

}
