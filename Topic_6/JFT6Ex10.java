//Create a variable named, dayOfWeek, in the main method.
// The variable should be of type, String. Assign the value “Monday” to the variable.
// Use a switch statement to test the value stored in the variable and display it in the console.

public class JFT6Ex10 {

    public static void main(String[] args) {

        String dayOfWeek = "Monday";
        String day;

        switch(dayOfWeek)
        {
            case "Monday":
                day = "Monday";
                break;
            case "Tuesday":
                day = "Tuesday";
                break;
            case "Wednesday":
                day = "Wednesday";
                break;
            case "Thursday":
                day = "Thursday";
                break;
            case "Friday":
                day = "Friday";
                break;
            case "Saturday":
                day = "Saturday";
                break;
            case "Sunday":
                day = "Sunday";
                break;

            default:
                day = "invalid entry";
        }
        System.out.println("Day is: " + day);
    }
}