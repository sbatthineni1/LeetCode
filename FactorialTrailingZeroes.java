public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(100));

    }

    public static int trailingZeroes(int n) {
        long factorial = n;
        for (int j = n - 1; j > 0; j--) {
            factorial = factorial * j;

        }
        System.out.println(factorial);
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;


    }


    }
