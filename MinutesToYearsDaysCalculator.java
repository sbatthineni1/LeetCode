public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(1440);

    }

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0)
            System.out.println("Invalid Value");
        else{
            long hour = minutes/60;

            long days = hour/24;
                        long year = days/365;
            long remainingDays = days%365;
            System.out.println(minutes + " min = " + year + " y and " + remainingDays +" d");
        }

    }

}
