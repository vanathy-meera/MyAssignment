package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// launch browser as guest to avoid popups
	    ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		//Initializing WebBrowser
		ChromeDriver drive = new ChromeDriver(options);
		
		//loading URL
		drive.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximising the browser
		drive.manage().window().maximize();
		
		//logging in
		drive.findElement(By.id("username")).sendKeys("demosalesmanager");
		drive.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		drive.findElement(By.className("decorativeSubmit")).click();
		drive.findElement(By.partialLinkText("CRM")).click();
		
		
		
		
		//Selecting Leads
		drive.findElement(By.linkText("Leads")).click();
		drive.findElement(By.linkText("Create Lead")).click();
		
		
		
		//entering company name, firstname,lastname,1st name local,dept,desc,mailid - xpath
		drive.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		drive.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Bhavani");
		drive.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Shankar");
		drive.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("BhaSha");
		drive.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("QA Tester");
		drive.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Lead generated through marketing campaign");
		drive.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("vidyameera@gmail.com");
		
		//DropDown
		 WebElement eleDD = drive.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select stateobj = new Select(eleDD);
		stateobj.selectByVisibleText("New York");
		
		
		//create lead
		drive.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		//click edit
		drive.findElement(By.xpath("//a[text()='Edit']")).click();
		
		//clear desc
		drive.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		
		//update imp.note
		drive.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Important Note");
		
		//click update
		drive.findElement(By.xpath("//input[@value='Update']")).click();
		
		//print title
		System.out.println(drive.getTitle());
		
		//close browser
		drive.close();
		
	

	}

}
