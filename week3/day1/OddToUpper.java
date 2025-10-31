package week3.day1;

public class OddToUpper {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String test = "changeme";
		char test1[] = test.toCharArray();
		
		for(int i= test1.length;i>=0;i--)
		{
			if(i%2 !=0)
			{
				test1[i]=Character.toUpperCase(test1[i]);
			}
		}
		System.out.println(test1);

	}

}
