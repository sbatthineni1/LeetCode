//import java.util.Arrays;
//
//public class PermutationInString {
//    public static void main(String[] args) {
//        String s1 = "ab", s2 = "eidbdooo";
//        System.out.println(checkInclusion(s1, s2));
//
//
//    }
//
//    public static boolean checkInclusion(String s1, String s2) {
//        if(s1.length() > s2.length())
//            return false;
//        int[] s1freq = new int[26];
//        int[] s2freq = new int[26];
//        for (int i = 0; i < s1.length(); i++) {
//            s1freq[s1.charAt(i) - 'a']++;
//            s2freq[s2.charAt(i) - 'a']++;
//        }
////        System.out.println(Arrays.toString(s1freq));
////        System.out.println(Arrays.toString(s2freq));
//        if(Arrays.equals(s1freq,s2freq)){
//            return true;
//        }
//        for(int i = s1.length(); i < s2.length(); i++){
//            s2freq[s2.charAt(i) -'a']--;
//            s2freq[s2.charAt(i+s1.length()) - 'a']++;
//            if(Arrays.equals(s1freq,s2freq)){
//                return true;
//            }
////            System.out.println(Arrays.toString(s1freq));
////            System.out.println(Arrays.toString(s2freq));
//
//        }
//        return false;
//
//    }
//}
