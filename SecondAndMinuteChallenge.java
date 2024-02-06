public class SecondAndMinuteChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-5, 45));

    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) return "Incorrect Value, Time not spent.";
        else {

            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        }
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) return "Incorrect Value, Time not spent.";
        else {

            int hours = minutes / 60;
            //System.out.println("hours: " + hours);
            int remainingMinutes = minutes % 60;
            //System.out.println("Remaining minutes: " + remainingMinutes);
            int remainingSeconds = seconds % 60;
            //System.out.println("remaining seconds : " + remainingSeconds);
            return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s ";
        }
    }

}
