package Assigment1;

public class stringoperations {
	public class StringManipulation {
	    public static void main(String[] args) {
	        String str1 = "Hello";
	        String str2 = "World";
	        int length = 4;

	        String result = concatReverseExtract(str1, str2, length);
	        System.out.println("Result: " + result);
	    }

	    public static String concatReverseExtract(String str1, String str2, int length) {
	        // Concatenate the two strings
	        String concatenated = str1.concat(str2);

	        // Check if the concatenated string is empty or length is larger than the concatenated string
	        if (concatenated.isEmpty() || length > concatenated.length()) {
	            return "Invalid input";
	        }

	        // Reverse the concatenated string
	        StringBuilder reversed = new StringBuilder(concatenated).reverse();

	        // Calculate the start index of the middle substring
	        int startIndex = (reversed.length() - length) / 2;

	        // Extract the middle substring
	        String middleSubstring = reversed.substring(startIndex, startIndex + length);

	        return middleSubstring;
	    }
	}


}
