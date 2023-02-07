

// Write a program to count the occurence of a given element x in an array
public class CountOccurence {
	
	static int occuranceOf(int[]  array, int x) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
				if (array[i] == x) {
					count++;
				}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {3, 7, 8, 7, 9, 4, 13, 7, 19};
		int result = occuranceOf(arr, 7);
		System.out.println(result);
	}

}
