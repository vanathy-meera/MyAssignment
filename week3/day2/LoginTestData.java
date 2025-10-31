package week3.day2;

public class LoginTestData extends TestData
{
	public void enterUsername()
	{
		System.out.println("Enter the UserName");
	}

	public void enterPassword()
	{
		System.out.println("Enter the Password");
	}
	
	public static void main(String[] args) 
	{
	
		TestData td = new TestData();
		td.enterCredentials();
		td.navigateToHomePage();
		
		LoginTestData ldt = new LoginTestData();
		ldt.enterUsername();
		ldt.enterPassword();
	}
}
