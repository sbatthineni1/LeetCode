public class CalculateDigitSumString {
    public static void main(String[] args) {
        String s = "11111222223";
        int k = 3;
        System.out.println(digitSum(s, k));
        //digitSum(s, k);

    }

    public static String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder resultSum = new StringBuilder();
            int i = 0;
            while(i < s.length()){
                int sum = 0;
                for(int j = 0; j < k && i < s.length(); j++){
                    sum += s.charAt(i++) - '0';
                }
                resultSum.append(sum);
            }
            s = resultSum.toString();
        }
        return s;
    }
}
