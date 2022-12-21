import java.util.Scanner;
import java.util.InputMismatchException;

public class JFT14Ex6 {
    public static void main(String[] args) {

//        not definitively required by the compiler to as it's a runtime exception, but good to do
        new JFT14Ex6().stringExtract();
    }

    public void stringExtract(){
        boolean completionStatus = false;
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for input

        System.out.print("Enter your message: ");
        String message = scanner.nextLine();  // Read user input

        String[] split = message.split(" ");

        while (completionStatus == false){
            try{
                System.out.print("Enter word position to extract: ");
                int word = scanner.nextInt();
                String extract = split[word - 1];
                System.out.println("Your word is: " + extract);
                completionStatus = true;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("A value from 1 to " + (split.length) + " is required");
            }
            catch (InputMismatchException e){
                System.out.println("Please enter an integer number.");
                scanner.nextLine();
            }
        }


    }
}
