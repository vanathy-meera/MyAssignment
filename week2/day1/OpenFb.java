package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFb {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.findElement(By.name("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		//String fname = driver.getTitle();
		System.out.println(driver.getTitle());
	}

}
