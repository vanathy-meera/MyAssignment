package week3.day1;

import java.util.Iterator;

import io.cucumber.core.internal.com.fasterxml.jackson.core.sym.Name;

public class DuplicateWords 
{

	public static void main(String[] args)
    {
		int count = 0;
		String text = "We learn Java basics as part of java sessions in java week1";
		//split -> 0: we, 1:learn, 2:java.....
		String[] text1 = text.split(" ");
		//
		for (int i = 0; i < text1.length; i++) 
		{
			for (int j = i+1; j < text1.length; j++) 
			{
				if(text1[i].equalsIgnoreCase(text1[j]))
				{
				text1[j]="";	
				count++;		
			    }
		    }	
	}
		if(count>1)
			for (int i = 0; i < text1.length; i++) 
			{
			if(!text1[i].equals(""))
			{
				System.out.print(text1[i] +" ");
			}
			}

}
}

