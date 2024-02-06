public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        double milesPerHour = 1.609;
        long rounded = Math.round(milesPerHour);
        if(kilometersPerHour < 0){
            return -1;
        }
        else {
            rounded = Math.round(kilometersPerHour/milesPerHour);
            return rounded;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println((milesPerHour < 0) ? "Invalid Value" :
                (kilometersPerHour + " km/h = " + milesPerHour +" mi/h"));

    }
}
