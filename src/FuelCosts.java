import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double galInTank = 0.0;
        double mPerGal = 0.0;
        double pPerGal = 0.0;
        double hPrice = 0.0;
        double mLeft = 0.0;
        boolean done = false;
        boolean again = false;
        String trash = "";

        do {
            System.out.println("How many gallons do you have? ");
            if (input.hasNextDouble()){
                galInTank = input.nextDouble();
                input.nextLine();
                done = true;
            }
            else
            {
                trash = input.nextLine();
                System.out.println("You said you had " + trash);
                System.out.println("Which is invalid");
            }
            System.out.println("What is your fuel efficiency per gallon? ");
            if (input.hasNextDouble()){
                mPerGal = input.nextDouble();
                input.nextLine();
                done = true;
            }
            else
            {
                trash = input.nextLine();
                System.out.println("You said you had this efficiency" + trash);
                System.out.println("Which is invalid");
            }
            System.out.println("What is the price per gallon? ");
            if (input.hasNextDouble()){
                pPerGal = input.nextDouble();
                input.nextLine();
                done = true;
            }
            else
            {
                trash = input.nextLine();
                System.out.println("You said you had this price" + trash);
                System.out.println("Which is invalid");
            }
            hPrice = pPerGal * 100;
            System.out.println("The price for 100 miles is: " + hPrice);

            mLeft = galInTank * mPerGal;
            System.out.println("You have this: " + mLeft + " many miles left");

            System.out.print("Do you want to keep going? (Y/N): ");
            String keepG = input.nextLine().trim().toLowerCase();
            if (!keepG.equals("y")) {
                again = true;
            }
        } while (!again);
    }
}