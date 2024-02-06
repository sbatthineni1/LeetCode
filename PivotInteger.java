public class PivotInteger {
    public static void main(String[] args) {
        System.out.println(pivotInteger(8));

    }

    public static int pivotInteger(int n) {
        int rightSum = 0;
        for (int i = 1; i <= n; i++) {
            rightSum += i;
        }
        int leftSum = 0;
        for (int i = 1; i <= n; i++) {
            rightSum -= i;
            if(rightSum == leftSum)
                return i;
            leftSum += i;


        }
        return -1;

    }
}
