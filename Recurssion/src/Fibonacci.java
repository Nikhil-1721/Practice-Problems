public class Fibonacci {

    private static int fibonacci(int n){
        if (n <= 2){
            return 1;
        }
        int i = fibonacci(n - 1);
        int j = fibonacci(n - 2);
        int result = i + j;
        return result;

    }


    public static void main(String[] args) {
        int result = fibonacci(4);
        System.out.println(result);
    }
}
