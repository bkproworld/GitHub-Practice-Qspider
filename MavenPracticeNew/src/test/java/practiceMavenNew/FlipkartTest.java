package practiceMavenNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartTest {
//Pull Back
	
	@Test(groups="smokeTest")
	public void m1() {
		System.out.println("Launching the Flipkart Application");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
	}
}
