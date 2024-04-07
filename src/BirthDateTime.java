import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int year = 0;
        int month = 0;
        int day = 0;
        int minutes = 0;
        int hours = 0;

        year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);
        day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31);
        hours = SafeInput.getRangedInt(in, "Enter your birth time (hours)", 1, 24);
        minutes = SafeInput.getRangedInt(in, "Enter your birth time (minutes)", 1, 59);

        System.out.println("\nYou were born on " + day + "/" + month + "/" + year + " at " + hours + ":" + minutes);
    }
}
