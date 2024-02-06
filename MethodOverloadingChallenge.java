public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(0, 8));
    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int height, int inches) {
        return convertToCentimeters((height * 12) + inches);
    }
}
