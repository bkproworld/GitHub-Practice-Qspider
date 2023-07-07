package practiceMavenNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DataFetchingInCmd {

	WebDriver driver;
	@Test
	public void cmdTest() {
		
		
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		
		if(BROWSER.equalsIgnoreCase("chrome")) {
			
			driver= new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("edge")) {
			
			
			driver= new EdgeDriver();
		}
		else {
			driver= new ChromeDriver();
			
		}
		driver.get(URL);
	}
}
