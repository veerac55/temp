package Assigment1;

import java.util.Scanner;

public class program3 
{
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		int count=0;
		for (int i=1; i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			System.out.println("it is a prime number..");
		}
		else
		{
			System.out.println("it is not a prime number... ");
		}
	}
}
		
		
				
			
		
			
	
	


