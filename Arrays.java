package Assigment1;

public class Arrays {
	public class ReverseArray {
	    public static void main(String[] args) {
	        // Declare and initialize an array of integers with consecutive numbers
	        int[] numbers = new int[10];  // Array to hold numbers from 1 to 10
	        for (int i = 0; i < numbers.length; i++) {
	            numbers[i] = i + 1;  // Initialize array with numbers 1 to 10
	        }

	        // Print the array in reverse order
	        System.out.print("Reversed array: ");
	        for (int i = numbers.length - 1; i >= 0; i--) {
	            System.out.print(numbers[i] + " ");
	        }
	    }
	}
}



