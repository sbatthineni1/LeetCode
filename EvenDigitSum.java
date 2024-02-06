public class EvenDigitSum {
    public static void main(String[] args) {
        int num = 30;

        System.out.println(countEven(num));


    }
    public static int countEven(int num) {
        int count = 0;
        for(int i = 1 ; i < num; i++){
            if(isEven(i))
                count++;
        }
        return count;

    }
    public static boolean isEven(int num) {
        int sum = 0;
        while (num > 0){
            sum += num %10;
            num = num/ 10;

        }
        return sum % 2 == 0;

    }
}
