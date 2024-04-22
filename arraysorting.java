package Assigment1;

public class arraysorting {
	import java.util.Arrays;
	import java.util.Random;

	public class BruteForceSort {
	    public static void main(String[] args) {
	        int arraySize = 10;
	        int arrayMin = 1;
	        int arrayMax = 100;

	        // Initialize array with random numbers
	        int[] arr = initializeArray(arraySize, arrayMin, arrayMax);
	        System.out.println("Original Array:");
	        printArray(arr);

	        // Sort array using brute force method (Bubble Sort)
	        bruteForceSort(arr);
	        System.out.println("Sorted Array:");
	        printArray(arr);
	    }

	    public static int[] initializeArray(int size, int minVal, int maxVal) {
	        int[] arr = new int[size];
	        Random rand = new Random();
	        for (int i = 0; i < size; i++) {
	            arr[i] = rand.nextInt(maxVal - minVal + 1) + minVal;
	        }
	        return arr;
	    }

	    public static void bruteForceSort(int[] arr) {
	        int n = arr.length;
	        // Traverse through all elements in the array
	        for (int i = 0; i < n; i++) {
	            // Last i elements are already sorted, so the inner loop goes until n-i-1
	            for (int j = 0; j < n - i - 1; j++) {
	                // Swap if the element found is greater than the next element
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }

	    public static void printArray(int[] arr) {
	        System.out.println(Arrays.toString(arr));
	    }
	}


}
