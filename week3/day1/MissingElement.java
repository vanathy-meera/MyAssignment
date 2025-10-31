package week3.day1;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int[] arr = {1, 4, 3, 2, 8, 6, 7};
		
		// Sort the array
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length - 1; i++) 
		{
			
		// Check the difference between consecutive numbers
		if (arr[i+1] != arr[i] + 1) 
		{
		//Print the missing number
		System.out.println("Missing number is: " + (arr[i] + 1));
		break;
		}
		}

	}

}
