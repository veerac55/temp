package Assigment1;

public class twosumproblem {
	// TODO Auto-generated constructor stub

	import java.util.HashMap;
	import java.util.Map;

	public class TwoSum {
	    public static int[] findTwoSum(int[] nums, int target) {
	        // Create a HashMap to store the numbers and their indices
	        Map<Integer, Integer> numMap = new HashMap<>();
	        
	        // Iterate over the array
	        for (int i = 0; i < nums.length; i++) {
	            int num = nums[i];
	            // Calculate the complement by subtracting the current number from the target
	            int complement = target - num;
	            
	            // Check if the complement exists in the HashMap
	            if (numMap.containsKey(complement)) {
	                // If found, return the indices of the complement and the current number
	                return new int[] {numMap.get(complement), i};
	            }
	            
	            // If not found, store the number and its index in the HashMap
	            numMap.put(num, i);
	        }
	        
	        // If no solution is found, throw an exception or return null
	        throw new IllegalArgumentException("No two sum solution found!");
	    }

	    public static void main(String[] args) {
	        int[] nums = {2, 7, 11, 15};
	        int target = 9;
	        int[] result = findTwoSum(nums, target);
	        System.out.println("Indices of the two numbers are: [" + result[0] + ", " + result[1] + "]");
	    }
	}


}
