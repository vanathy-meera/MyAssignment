package week3.day2;

public class Polymorphism 
{
	public void reportStep(String msg, String status)
	{
		System.out.println("Message is: " +msg);
		System.out.println("Status: " +status);
	}
	public void reportStep(String msg, String status, boolean boo)
	{
		System.out.println("Message Sent is: " +msg);
		System.out.println("Status: " +status);
		System.out.println("Snapshot to be taken: " +boo);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Polymorphism ploy = new Polymorphism();
		ploy.reportStep("Print Result","Yes");
		ploy.reportStep("Print Result","No",false);
		ploy.reportStep(null, null, false);
	
		
	}

}
