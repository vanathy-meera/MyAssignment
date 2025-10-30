package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
        //Guest mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		//Chrome driver and open browser
		ChromeDriver drive = new ChromeDriver(options);
		drive.get("http://leaftaps.com/opentaps/");
		drive.manage().window().maximize();
		
		//Login & CRM link
		drive.findElement(By.id("username")).sendKeys("demosalesmanager");
		drive.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		drive.findElement(By.className("decorativeSubmit")).click();
		drive.findElement(By.partialLinkText("CRM")).click();
		
		//Selecting Leads
		drive.findElement(By.linkText("Leads")).click();
		
		// find lead
		drive.findElement(By.linkText("Find Leads")).click();
		
		//find ph link & enter ph no
		drive.findElement(By.linkText("Phone")).click();
		drive.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8765432109");
		drive.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		//Capture the lead ID of the first resulting lead
		WebElement firstLead = drive.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)"));
		String leadID = firstLead.getText();
		System.out.println("Lead to be deleted is " +leadID);
		
		//Open the lead ID
		firstLead.click();
		Thread.sleep(1000);
		
	// delete the lead
		drive.findElement(By.linkText("Delete")).click();
		Thread.sleep(1000);
			    
	    //find lead
	    drive.findElement(By.linkText("Find Leads")).click();
	    
	    //entering captured ID and finding
	    drive.findElement(By.name("id")).sendKeys(leadID);
	    drive.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    Thread.sleep(2000);
	    
	    //vERIFY msg
	    WebElement message = drive.findElement(By.className("x-paging-info"));
	    String msgtxt = message.getText();
	    
	    //Verify message
	    if(msgtxt.equals("No records to display"))
	    	System.out.println("Deleted Successfully");
	    else
	    	System.out.println("Unsuccessful Deletion");
	    
	    // close browser
	    
	    drive.quit();
				
		
	}

}
