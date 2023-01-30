
// Q3. Search the given element x in an Array

public class Search {

	static int search(int x, int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] array = { 2, 7, 8, 9 };
		int result = search(17, array);

		System.out.println(result);

	}

}
