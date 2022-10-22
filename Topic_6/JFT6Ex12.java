//Create a Java program which determines a person’s marital status.
// Create the main method and within it, a variable named status.
// The variable should be of type char. Store the value ‘D’ in the variable.
// Use a switch statement to determine marital status. Display an appropriate message.
// For example, if marital status is single, display the message "Status: Single".
// The categories are ‘S’ (Single), ‘D’ (Divorced), ‘M’ (Married), ‘W’ (Widowed).
// If there is no match, the message, “Invalid data”, should be displayed.

public class JFT6Ex12 {

    public static void main(String[] args) {

        char status;
        String printResponse;

        status = 'W';

        switch(status)
        {
            case 'S':
                printResponse = "single";
                break;
            case 'D':
                printResponse = "divorced";
                break;
            case 'M':
                printResponse = "married";
                break;
            case 'W':
                printResponse = "widowed";
                break;
            default:
                printResponse = "Invalid data";
        }
        System.out.println("Status: " +printResponse);
    }
}