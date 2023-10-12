package Pom_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import POM.FacebookLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		// opening chrome browser
		WebDriver driver = new EdgeDriver();
		// maximizing the browser
		driver.manage().window().maximize();
		// implicit statement
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		FacebookLoginPage flp=new FacebookLoginPage(driver);
		flp.emailTextfield("sasi");
		flp.passwordTextfield("kala");
		flp.loginButton();

	}

}
