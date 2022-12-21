import java.util.Scanner;
import java.util.InputMismatchException;

public class JFT14Ex5 {
    public static void main(String[] args) {

//        not definitively required by the compiler to as it's a runtime exception, but good to do
        boolean completionStatus = false;
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for input

        System.out.print("Enter your message: ");
        String message = scanner.nextLine();  // Read user input

        while (completionStatus == false){
            try{
                System.out.print("Enter character position to extract: ");
                int position = scanner.nextInt();
                char extract = message.charAt(position - 1);
                System.out.println("Your character is: " + extract);
                completionStatus = true;
            }
            catch (StringIndexOutOfBoundsException e) {
                System.out.println("A value from 1 to " + (message.length()) + " is required");
            }
            catch (InputMismatchException e){
                System.out.println("Please enter an integer number.");
                scanner.nextLine();
            }
        }

    }
}
