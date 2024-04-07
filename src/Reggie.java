import java.util.Scanner;

public class Reggie {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String regEx = "^(M|m)\\\\d{5}$";

        String mNumber = "";
        String socialSecurity = "";
        String menuChoice = "";

        socialSecurity = SafeInput.getRegExString(in, "Enter your social security number", "^\\d{3}-\\d{2}-\\d{4}$");
        mNumber = SafeInput.getRegExString(in, "Enter your UC M number", "^(M|m)\\d{8}$");
        menuChoice = SafeInput.getRegExString(in, "Enter your menu choice", "^[OoSsVvQq]$");

    }
}
