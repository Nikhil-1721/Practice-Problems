
// Q1. Find out sum of all the numbers in an Array

public class SumOfNumbers {

	static int sum(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int[] array = {5, 7, 18, 21};
		int result = sum(array);
		
		System.out.println(result);

	}

}
