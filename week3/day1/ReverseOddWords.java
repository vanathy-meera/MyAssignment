package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String test = "I am a software Tester";
		
		String[] test2 = test.split(" ");
			
		
	//checking odd positions
			for(int i= 0;i<test2.length;i++)
			{
				if(i%2 !=0)
				{
					char[] odd = test2[i].toCharArray();
					for (int j = odd.length-1; j>=0; j--) 
					{
						System.out.print(odd[j]);
					}
				}
				else
				{
					System.out.print(test2[i]);
				}
		
			System.out.print(" ");
			}	

	}

}
