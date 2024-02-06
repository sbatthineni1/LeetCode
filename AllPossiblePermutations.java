public class AllPossiblePermutations {
    public static void main(String[] args) {
        String str = "ABC";
        permute(str, 0, str.length());


    }
    public static void permute(String str, int start, int end){
        if(start == end-1){
            System.out.println(str);
        }
        else{
            for(int i = start; i < end; i++){
                str= swap(str, start, i);
                permute(str, start+1, end);
                str = swap(str, start, i);

            }
        }

    }
    public static String swap(String str, int i, int j){
        //swap chars at index i with characters at index j
        char[] chArray = str.toCharArray();
        char ch;
        ch = chArray[i];
        chArray[i] = chArray[j];
        chArray[j] = ch;

        return String.valueOf(chArray);
    }

}
