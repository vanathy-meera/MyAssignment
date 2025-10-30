package week1.day2;

public class IsPrimeNumber 
{
	
	public static void main(String[] args) 
	{
		 int n = 367;
	     boolean isPrime = true;  // assuming given no is prime
	     if (n <= 1) 
	     {
	        isPrime = false;
	     }
	      else 
	     {
	      for (int i = 2; i < n; i++) 
	     {
	       if (n % i == 0)  // i dividing n w/o reminder, then it is not a prime number
	      {
	         isPrime = false;   // if it divides, it is prime and the loop breaks
	         break;
	      }
	      }
	      }

	  
	        if (isPrime)  // if true still continues
	        {
	            System.out.println(n + " is a prime number.");
	        } 
	        else 
	        {
	            System.out.println(n + " is not a prime number.");
	        }
    }
	}
