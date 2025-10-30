package week2.day1;

import org.apache.xmlbeans.impl.xb.xsdschema.impl.SelectorDocumentImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLeads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");	
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		//to click leads
		driver.findElement(By.linkText("Leads")).click();
		//to click createlead
		driver.findElement(By.linkText("Create Lead")).click();
		//to enter a companyname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//to enter a first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("VMMeera");
		//to enter a last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("VM");
		//to enter a title
		driver.findElement(By.name("generalProfTitle")).sendKeys("Mrs");

		System.out.println(driver.getTitle());
		
		//DD using selectbyIndex
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select selObj = new Select(sourceDD);
		selObj.selectByIndex(6);
		//DD using selectByVisibleText
		WebElement stateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateObj = new Select(stateDD);
		stateObj.selectByVisibleText("Florida");
		//DD usinf selectbycontainsvisibleText
		WebElement marketingDD = driver.findElement(By.name("marketingCampaignId"));
		Select marketObj = new Select(marketingDD);
		marketObj.selectByContainsVisibleText("Click");
		//sublit leads
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.close();
	}

}
