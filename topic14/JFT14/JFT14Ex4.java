import java.util.Scanner;
import java.util.InputMismatchException;

public class JFT14Ex4 {
    public static void main(String[] args) {

//        not definitively required by the compiler to as it's a runtime exception, but good to do
        String[] destinations = {"Cork", "Athlone", "Limerick", "Sligo", "Dublin"};

        System.out.println("The following destinations are available:");
        for(int i = 0; i < destinations.length; i++){
            System.out.println((i+1) + ". " + destinations[i]);
        }

        Scanner destinationInput = new Scanner(System.in);  // Create a Scanner object for input
        boolean selectionRequired = true;

        while(selectionRequired == true) {

            try {
                System.out.print("Enter selection: ");
                int destInt = destinationInput.nextInt();  // Read user input
                System.out.println("Selected destination: " + destinations[destInt - 1]);
                selectionRequired = false;
            }
            catch (ArrayIndexOutOfBoundsException aex) {
                System.out.println("A value from 1 to " + (destinations.length) + " is required");
            }
            catch (InputMismatchException e){
                System.out.println("Please enter an integer number");
                destinationInput.nextLine();
            }
        }
    }
}
