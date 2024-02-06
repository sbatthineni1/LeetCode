public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(true, 22));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking) return false;
        else {
            if ((hourOfDay >= 0) && (hourOfDay <= 23))
                if ((hourOfDay < 8) || hourOfDay > 22) return true;
            return false;
        }

    }


}

