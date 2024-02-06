public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2016));
        System.out.println(isLeapYear(2000));

    }

    public static boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999)) return false;
        else {

            if ((year % 4 == 0) && (year % 100 != 0)) return true;
            if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) return true;
            if ((year % 4 != 0) || (year % 400 != 0)) return false;
        }
        return false;
    }
}
