package task15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class BowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Launch the chrome browser and load google url and search for Selenium web browser
	
	//set up the driver and launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//pass the url
		driver.get("https://www.google.com/");
	
	//maximize the window
		driver.manage().window().maximize();
		
		//Locate the element
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium browser driver",Keys.ENTER);
	//to close the window
	driver.close();
	
	}

}
