public class SumOfDigits {
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 2;
        System.out.println(getLucky(s, k));

    }

    public static int getLucky(String s, int k) {
        StringBuilder converted =convertString(s);
        for(int i = 0; i < k; i++){
            converted = transformInteger(converted);
        }
        return Integer.parseInt(converted.toString());

    }

    public static StringBuilder convertString(String s) {
        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()) {
            int value = ch - 'a' + 1;
            result.append("(").append(value).append(")");
        }
        return result;
    }

    public static StringBuilder transformInteger(StringBuilder s) {
        int sum = 0;
        for (char ch : s.toString().toCharArray()) {
            if(Character.isDigit(ch)){
                sum += Character.getNumericValue(ch);
            }

        }
        return new StringBuilder(Integer.toString(sum));
    }

}
