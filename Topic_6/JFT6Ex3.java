//Create another version of the Fisherman’s permit program to comply with the following logic.
//A fisherman is only allowed to go on a fishing trip if he holds a fishing permit and is aged over 18.
//Create two variables, one to store the permit status (store the value, false) and another to store the age of the person (store the value, 19).
//Use a single if statement as part of the solution.

public class JFT6Ex3 {

    public static void main(String[] args) {

        boolean hasFishingPermit = false;
        int age = 19;

        if (hasFishingPermit && age > 18)
        {
            System.out.println("Enjoy your fishing");
        }
        else
        {
            System.out.println("Sorry, no fishing for you today :'( ");
        }

    }
}