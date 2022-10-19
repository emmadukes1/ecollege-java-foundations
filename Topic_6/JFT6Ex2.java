//A fishing trip will only go ahead if there are more than five registrations.
//Assume that only two people want to go on the trip (store this information in a variable).
//Create a Java program utilising an if-else statement to determine if the trip is to go ahead.
//Display an appropriate message in the console.

public class JFT6Ex2 {

    public static void main(String[] args) {

        int numberForTrip = 2;

        if (numberForTrip > 5)
        {
            System.out.println("The trip will go ahead");
        }
        else
        {
            System.out.println("Sorry, no fishing for you today as there are not more than 5 people :'( ");
        }

    }
}