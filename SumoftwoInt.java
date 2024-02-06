public class SumoftwoInt {
    public static void main(String[] args) {
        int a = 1, b = 2;
        System.out.println(getSum(a,b));

    }
    public static int getSum(int a, int b) {
        //return Math.addExact(a, b);
        while( b != 0){
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;


    }
}
