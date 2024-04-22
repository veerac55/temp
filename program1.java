package Assigment1;

public class program1{ 
	
	public static void main(String[] args) 
	{
		System.out.println("Declaring two variables..");
		int variable1=10;
		int variable2=20;
		System.out.println("Before sorting......");
		System.out.println("variable1 : "+variable1);
		System.out.println("variable2 : "+variable2);
		System.out.println("After sorting.......");
		variable1=variable1+variable2;
		variable2=variable1-variable2;
		variable1=variable1-variable2;
		System.out.println("variable1 : "+variable1);
		System.out.println("variable1 : "+variable2);
		
	}

}
