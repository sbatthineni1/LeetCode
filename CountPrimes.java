public class CountPrimes {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrimes(n));

    }

    public static int countPrimes(int n) {
        if (n < 2) return 0;
        boolean[] notPrime = new boolean[n];
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (!notPrime[i])
                count++;
            for (int j = 2; i * j < n; j++) {
                notPrime[i * j] = true;

            }


        }
        return count;


    }
}
