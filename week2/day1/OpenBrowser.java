package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver(); // instantiating the browser. ie creating obj for browser
		driver.get("https://www.facebook.com/");
		FirefoxDriver driver1 = new FirefoxDriver();
		driver.manage().window().maximize();
		String bname = driver.getTitle(); // created a name to store the title
		System.out.println(driver.getTitle()); // prints the browser name
		System.out.println("Browser name is " +bname); // prints using the string variable created
		//driver.close();
	
}
}