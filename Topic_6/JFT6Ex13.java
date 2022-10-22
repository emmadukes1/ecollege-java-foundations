//Create a Java program which stores the number of miles ran by a marathon runner.
//Create a variable named noOfMilesCovered of type byte. Assign a value of 10 to the variable.
//A marathon runner is entitled to a water break, when he/she has covered the following number of miles: 5 | 10 | 15 | 20 | 25.
//If the marathon runner happens to be at any one of these water break markers, display the message, “Water is available at this mark”.
//Otherwise, display the message, “No water is available at this mark”. Solve the problem using either:
//• A switch statement
//• If-Else-if-Else statement

public class JFT6Ex13 {

    public static void main(String[] args) {

        byte noOfMilesCovered;
        String printResponse;

        noOfMilesCovered = 12;

        switch(noOfMilesCovered)
        {
            case 5:
            case 10:
            case 15:
            case 20:
            case 25:
                printResponse = "Water is available at this mark";
                break;
            default:
                printResponse = "No water is available at this mark";
        }
        System.out.println("Status: " + printResponse);
    }
}