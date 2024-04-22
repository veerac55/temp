package Assigment1;

import java.util.Scanner;

public class program2 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 1 for addition");
		System.out.println("enter 2 for subtraction");
		System.out.println("enter 3 for multiplication");
		System.out.println("enter 4 for division");
		int num=scan.nextInt();
		System.out.println("enter integer 1");
		int a=scan.nextInt();
		System.out.println("enter integer 2");
		int b=scan.nextInt();
		switch(num)
		{
		case 1:
			System.out.println("addition is : "+(a+b));
			break;
		case 2:
			System.out.println("subtraction is : "+(a-b));
			break;
		case 3:
			System.out.println("multiplication is :"+(a*b));
			break;
		case 4:
			System.out.println("division is : "+(a/b));
			break;
		
		}
	}
}
		
	

