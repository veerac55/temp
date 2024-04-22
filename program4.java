package Assigment1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class program4 {
	private void statatic() {
		// TODO Auto-generated method stub

	} void reverse(Integer a[])
	{
		Collections.reverse(Array.asList(a));
		System.out.println(Arrays.asList(a));
	}
	public static void main(String[] args)
	{
		int n;
		Integer [] arr = {10,20,30,40,50};
		reverse (arr);
	}
}
		
	


