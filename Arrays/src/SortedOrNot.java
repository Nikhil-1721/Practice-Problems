
// Check whether an Array is sorted in Ascending order or not
public class SortedOrNot {
	
	static boolean sorted(int[] arr) {
		boolean check = true;
		for (int i = 0; i < arr.length - 1; i++) {
			
			if (arr[i]  > arr[i + 1]) { // Ascending order condition
				check = false;
			}
		}
		
		return check;
	}
	
	public static void main(String[] args) {
		
		int[] array = {1, 3, 4, 6, 8, 99, 12};
		boolean check = sorted(array);
		System.out.println(check);
	}

}
