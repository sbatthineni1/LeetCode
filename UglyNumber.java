public class UglyNumber {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(isUgly(0));

    }

    public static boolean isUgly(int n) {
        if (n == 1) return true;
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        return n == 1;
    }
}