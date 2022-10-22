//Write a Java program to model an air conditioning system. 
// Assume that the current temperature is 14.19 degrees centigrade. 
// Store this information in a variable. 
// Test the value stored in the variable. 
// Display an appropriate message to the user, as per the table below.
// Test your program with different temperatures.
//20+
//tropical
//10 to 19
//warm
//0 to 9
//moderate
//-1 to -4
//cold
//-5 or below
//arctic

public class JFT6Ex9 {

    public static void main(String[] args) {

        float currentTemp;
        String tempMessage;

        currentTemp = -20.00f;

        if (currentTemp >= 20.00f) {
            tempMessage = "tropical";
        }

        else if (currentTemp >= 10.00f) {
            tempMessage = "warm";
        }

        else if (currentTemp >= 0.00f) {
            tempMessage = "moderate";
        }
        else if (currentTemp >= -4.00f) {
            tempMessage = "cold";
        }
        else{
            tempMessage = "arctic";
        }

        System.out.println("Climate is: " + tempMessage);
    }
}