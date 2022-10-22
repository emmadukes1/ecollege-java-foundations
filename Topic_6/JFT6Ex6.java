//The bouncer at the local pub will only allow a patron to enter, if both of the following conditions are met:
// The patron must be 18 years of age or older.
// The patron must be sober.
// Create a Java program, making use of an if-else statement to determine if a patron can enter
//the pub.
// Make use of variables as part of your solution and store sample values. Test your solution.

public class JFT6Ex6 {

    public static void main(String[] args) {

        int patronAge;
        boolean sobrietyStatus;

        patronAge = 19;
        sobrietyStatus = false;

        if (patronAge >= 18 && sobrietyStatus == true) {
            System.out.println("You may enter");
        }
        else {
            System.out.println("Entry denied");
        }

    }
}