import java.util.Scanner;
public class MetricConverter {
    public static void main(String[] args) {
        double user = 0.0;
        double miles = 0.0;
        double feet = 0.0;
        double inches = 0.0;
        boolean done = false;
        boolean again = false;
        String trash = "";

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("What is the measurement you have in meters? ");
            if (input.hasNextDouble()) {
                user = input.nextDouble();
                input.nextLine();
                done = true;
            }
            else
            {
                trash = input.nextLine();
                System.out.println("You said you had " + trash);
                System.out.println("Which is invalid");
            }
            miles = user * .00062137;
            feet = user * 3.28084;
            inches = user * 39.3701;
            System.out.println("Meters to Miles: " + miles);
            System.out.println("Meters to Feet: " + feet);
            System.out.println("Meters to Inches: " + inches);

            System.out.print("Do you want to keep going? (Y/N): ");
            String keepG = input.nextLine().trim().toLowerCase();
            if (!keepG.equals("y")) {
                again = true;
            }
        } while (!again);
    }
}