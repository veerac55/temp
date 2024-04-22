package Assigment1;

public class advancedarrayoperations {
	
	import java.util.Arrays;

	public class ArraySlicer {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	        int startIndex = 2;
	        int endIndex = 5;

	        // Slice the array
	        int[] slicedArray = sliceArray(arr, startIndex, endIndex);
	        System.out.println("Original Array: " + Arrays.toString(arr));
	        System.out.println("Sliced Array: " + Arrays.toString(slicedArray));
	    }

	    public static int[] sliceArray(int[] arr, int startIndex, int endIndex) {
	        // Calculate the length of the sliced array
	        int length = endIndex - startIndex + 1;
	        // Create a new array to store the sliced elements
	        int[] slicedArray = new int[length];
	        // Copy the elements from the original array to the sliced array
	        for (int i = startIndex; i <= endIndex; i++) {
	            slicedArray[i - startIndex] = arr[i];
	        }
	        return slicedArray;
	    }
	}


}
