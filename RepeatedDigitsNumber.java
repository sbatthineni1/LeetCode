public class RepeatedDigitsNumber {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(numDupDigitsAtMostN(n));

    }

    public static int numDupDigitsAtMostN(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            String num = Integer.toString(i);
            boolean hasDups = false;
            for (int j = 0; j < num.length(); j++) {
                char c = num.charAt(j);
                if (num.indexOf(c) != num.lastIndexOf(c)) {
                    hasDups = true;
                    break;
                }
            }
            if (hasDups) {
                count++;

            }



        }
        return count;
    }
}


//        for(int i = 11; i <= n; i++){
//            if(isDigitsRepeated(i))
//                count++;
//        }
//        return count;
//
//    }
//
//    public static boolean isDigitsRepeated(int n) {
//        Map<Integer, Integer> digitFreq = new HashMap<>();
//
//        while (n > 0) {
//            int digit = n % 10;
//            digitFreq.put(digit, digitFreq.getOrDefault(digit, 0) + 1);
//            if(digitFreq.get(digit) > 1)
//                return true;
//            n = n / 10;
//        }
//        return false;
//    }

