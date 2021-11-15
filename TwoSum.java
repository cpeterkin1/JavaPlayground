public class TwoSum {
	
	/*
	 * CHALLENGE -- Given an array of integers, return indices of the two numbers
	 * such that they add up to a specific target.
	 * 
	 * You may assume that each input would have exactly one solution, and you may not use
	 * the same element twice.
	 * 
	 * Example:
	 * 
	 * Given nums = [2, 7, 11, 15], target = 9,
	 * 
	 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1]
	 */
	
	
	/*
	 * Main -- Call and test the solution method
	 */
	
	public static void main(String[] args) {
	//	twoSum(int[] arr, int target);
	    int[] arr = {2,7,11,13};
	    twoSum(arr, 9);
	}
	
	
	/*
	 * twoSum -- this method solves the problem.
	 */
	
	public static void twoSum(int[] arr, int target) {
		int index1 = 0;
		int index2 =1;
		int num1, num2;
		boolean found = false;
		
		while (!found) {
			num1 = arr[index1];
			num2 = arr[index2];
			if (num1 + num2 == target) {
				found = true;
			}
			else {
				index2++;
				if (index2 == arr.length) {
					index1 +=1;
					index2 = index1+1;
				}
				if (index2 == arr.length) {
					break;
				}
			}
		}
		
		if (found) {
			System.out.println("["+index1+", "+index2+"]");
		}
		else {
			System.out.println("No matches");
		}
	}
}