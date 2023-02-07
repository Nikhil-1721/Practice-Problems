
public class LastOccurence {
	
	static int lastOccurenceOf(int[] arr, int x) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				index = i;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		
		int[] array = {5, 6, 18, 9, 5, 18, 5, 5, 65};
		int result = lastOccurenceOf(array, 5);
		System.out.println(result);
	}

}
