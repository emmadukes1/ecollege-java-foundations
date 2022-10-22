//Create a Java program which determines the number of fish in a tank. Create the main method and within it, a variable named noOfFishInTank. The variable should be of type int. Store the value 3 in the variable.
//Use a switch statement to determine the value stored in the variable and display an appropriate message in the console.
//  No. of Fish
//No fish
//One fish
//Two fish
//Three fish
//Any other number of fish
//Save the program as JFT6Ex11.java Exercise 12
//Message to Display
//There are no fish in the tank.
//There is one fish in the tank.
//There are two fishes in the tank.
//There are three fishes in the tank.
//An indeterminate number of fish are in the tank.

public class JFT6Ex11 {

    public static void main(String[] args) {

        int noOfFishInTank;
        String printResponse;
        noOfFishInTank = 34;

        switch(noOfFishInTank)
        {
            case 0:
                printResponse = "There are no fish in the tank";
                break;
            case 1:
                printResponse = "There is one fish in the tank";
                break;
            case 2:
                printResponse = "There is 2 fish in the tank";
                break;
            case 3:
                printResponse = "There is 3 fish in the tank";
                break;
            default:
                printResponse = "An indeterminate number of fish are in the tank";
        }
        System.out.println(printResponse);
    }
}