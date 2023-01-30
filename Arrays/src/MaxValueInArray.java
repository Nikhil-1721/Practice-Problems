
//Q2. Find the maximum value in an Array
public class MaxValueInArray {

	static int maxValue(int[] arr) {

		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] array = { 13, 16, 91, 18 };
		int result = maxValue(array);

		System.out.println(result);
	}

}
