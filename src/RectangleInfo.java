import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = 0;
        int width = 0;
        int area = 0;
        int diagonal = 0;
        boolean done = false;
        boolean again = false;
        String trash = "";

        do {
            System.out.println("What is the Length? ");
            if (input.hasNextDouble()) {
                length = input.nextInt();
                input.nextLine();
                done = true;
            }
            else
            {
                trash = input.nextLine();
                System.out.println("You said you had " + trash);
                System.out.println("Which is invalid");
            }
            System.out.println("What is the width? ");
            if (input.hasNextDouble()) {
                width = input.nextInt();
                input.nextLine();
                done = true;
            }
            else
            {
                trash = input.nextLine();
                System.out.println("You said you had " + trash);
                System.out.println("Which is invalid");
            }
            area = length * width;

            diagonal = (int) Math.sqrt((length*length)+(width*width));

            System.out.println("The area is " + area );
            System.out.println("The diagonal is " + diagonal);

            System.out.print("Do you want to keep going? (Y/N): ");
            String keepG = input.nextLine().trim().toLowerCase();
            if (!keepG.equals("y")) {
                again = true;
            }
        }while(!again);
    }
}