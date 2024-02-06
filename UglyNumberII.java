public class UglyNumberII {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(isUgly(n));

    }

    public static int isUgly(int n) {

        if (n <= 0) {
            return 0;
        }

        int[] ugly = new int[n];
        ugly[0] = 1;

        int index2 = 0, index3 = 0, index5 = 0;

        for (int i = 1; i < n; i++) {
            int nextUgly = Math.min(ugly[index2] * 2, Math.min(ugly[index3] * 3, ugly[index5] * 5));
            ugly[i] = nextUgly;

            if (nextUgly == ugly[index2] * 2) {
                index2++;
            }
            if (nextUgly == ugly[index3] * 3) {
                index3++;
            }
            if (nextUgly == ugly[index5] * 5) {
                index5++;
            }
        }

        return ugly[n - 1];
    }
}















//        int count = 0;
//        int[] isUglyArray = new int[n];
//        int i = 1;
//        while (count < n) {
//            if (check(i)) {
//                isUglyArray[count] = i;
//                count++;
//            }
//            i++;
//        }
//        return isUglyArray[n - 1];
//    }
//
//    public static boolean check(int n) {
//        if (n == 1) return true;
//        while (n % 2 == 0) {
//            n /= 2;
//        }
//        while (n % 3 == 0) {
//            n /= 3;
//        }
//        while (n % 5 == 0) {
//            n /= 5;
//        }
//        return n == 1;
//    }
//}
