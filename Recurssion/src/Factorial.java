//Program to calculate the factorial of a number

public class Factorial {

    private static int factorial(int n){
        if (n ==1 || n == 0){
            return 1;
        }
        int m = factorial(n - 1);
        int result = n * m;
        return result;
    }

    public static void main(String[] args) {

        int result = factorial(5);
        System.out.println(result);
    }
}