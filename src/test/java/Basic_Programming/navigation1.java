package Basic_Programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigation1 {

	public static void main(String[] args) {
		//WebDriverManager.edgedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalam\\OneDrive\\Desktop\\Batches\\QCO-SOEJVD\\QCO_SOEJVD_A2\\src\\main\\resources\\chromedriver.exe");
		// opens the empty browser
		WebDriver driver = new ChromeDriver();

		// for maximizng
		driver.manage().window().maximize();
		// to open the browser
		driver.navigate().to("https://www.amazon.in/");
		// to open the browser
		driver.get("https://www.facebook.com/");

	}

}
