import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c;
        double f;
        String trash = "";
        boolean done = false;
        boolean again = false;

        do {
            System.out.println("What is the temperature in C? ");
            if (input.hasNextDouble()) {
                c = input.nextDouble();
                input.nextLine();
                done = true;
                f = (c * 1.8) + 32;
                System.out.println("This is the temperature in F: " + f);
            } else {
                trash = input.nextLine();
                System.out.println("You said the temp was " + trash);
                System.out.println("Which is invalid");
            }
            System.out.print("Do you want to keep going? (Y/N): ");
            String keepG = input.nextLine().trim().toLowerCase();
            if (!keepG.equals("y")) {
                again = true;
            }



        } while (!again);
    }
}