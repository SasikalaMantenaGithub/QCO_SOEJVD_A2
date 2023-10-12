package Basic_Programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launching_browsers {

	public static void main(String[] args) throws Throwable {
		//driver related statement
	//	WebDriverManager.edgedriver().setup();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kalam\\OneDrive\\Desktop\\Batches\\QCO-SOEJVD\\QCO_SOEJVD_A2\\src\\main\\resources\\geckodriver.exe");
		//opens the empty browser
		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalam\\OneDrive\\Desktop\\Batches\\QCO-SOEJVD\\QCO_SOEJVD_M8\\src\\main\\resources\\chromedriver.exe");
//		
//
//		// upcating statement
//		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		//for maximizng
		driver.manage().window().maximize();

	}

}
