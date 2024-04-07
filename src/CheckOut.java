import java.util.Scanner;

public class CheckOut {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double itemCost = 0;
        double totalCost = 0;
        boolean done = true;

        do {

            itemCost = SafeInput.getRangedDouble(in, "Input item price", 0.50, 10.00);

            totalCost = totalCost + itemCost;

            System.out.println("\nThat item costs " + itemCost);
            System.out.println("\nYour total is " + totalCost);

            done = SafeInput.getYNConfirm(in,"End item input?");

        } while (!done);


    }

}
