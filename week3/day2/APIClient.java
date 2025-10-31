package week3.day2;

public class APIClient 
{
	public void sendRequest(String endpoint)
	{
		System.out.println("Printing Endpoint" +endpoint);
	}
	public void sendRequest(String endpoint,String requestBody, boolean requestStatus)
	{
		System.out.println("Printing Endpoint:" +endpoint);
		System.out.println("Printing requestBody:" +requestBody);
		System.out.println("Printing Request Status:" +requestStatus);
	}

	public static void main(String[] args) 
	{
	APIClient cli = new APIClient();
	cli.sendRequest("EndPoint 1");
	cli.sendRequest("Endpoint-2", "Request Negative", false);
	
	}

}
