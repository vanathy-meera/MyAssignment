package week3.day2;

public class LoginPage extends BasePage
{
		@Override
		void performCommonTasks()
		{
		System.out.println("Perform Common Task");
		}
	public static void main(String[] args) 
	{
		BasePage b1 = new BasePage();
		BasePage b2 = new LoginPage();
		b1.findElement();
		b1.clickElement();
		b1.performCommonTasks();
		b2.performCommonTasks();
		}

	}

