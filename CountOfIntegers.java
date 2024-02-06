public class CountOfIntegers {
    public static void main(String[] args) {
        String num1 = "1", num2 = "12";
        int min_sum = 1, max_sum = 8;
        System.out.println(count(num1, num2, min_sum, max_sum));

    }

    public static int count(String num1, String num2, int min_sum, int max_sum) {
        int count = 0;
        long n1 = Integer.parseInt(num1);
        long n2 = Integer.parseInt(num2);

        while (n1 <= n2) {
            long temp = n1;
            long sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp = temp / 10;
            }
            if (sum >= min_sum && sum <= max_sum)
                count++;
            n1++;
        }
        return count;
    }
}
