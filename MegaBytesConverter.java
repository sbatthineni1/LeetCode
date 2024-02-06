public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);

    }

    public static void printMegaBytesAndKiloBytes( int kiloBytes) {

        int megaByte = Math.round(kiloBytes / 1024);
        int remainingByte = kiloBytes % 1024;
        System.out.println((kiloBytes < 0) ? "Invalid Value"
                : (kiloBytes + " KB = " +megaByte +" MB and "+ remainingByte +" KB"));
    }
}
