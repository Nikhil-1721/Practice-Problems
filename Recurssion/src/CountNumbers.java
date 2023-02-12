//Program that takes a number x and print all the previous numbers till 1

public class CountNumbers {

    private static void count(int n){
        if (n == 0) {
            return;
        }
        System.out.println(n);
        count(n - 1);

    }

    public static void main(String[] args) {

        count(5);

    }
}
