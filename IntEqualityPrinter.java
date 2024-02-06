public class IntEqualityPrinter {
    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);

    }

    public static void printEqual (int numOne, int numTwo, int numThree) {
        if ((numOne < 0) || (numTwo < 0) || (numThree <0))
            System.out.println("Invalid Value");
        else if ((numOne == numTwo) && (numTwo == numThree)) {
            System.out.println("All numbers are equal");
        }
        else if ((numOne != numTwo) && (numTwo != numThree) && (numOne != numThree)) {
            System.out.println("All numbers are different");
        }
        else
            System.out.println("Neither all are equal or different");
    }
}
