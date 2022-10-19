//Create a Java program to model the basic workings of an ATM machine.
//Use an if-else statement to determine if a cash withdrawal can be made.
//Assume the amount to withdraw is 20.
//Assume the existing balance is 180.
//Determine if the withdrawal request can be made.
//If the request is processed, calculate and display the new balance.

public class JFT6Ex4 {

    public static void main(String[] args) {

        double withdrawlAmount = 20.00;
        double existingBalance = 160.00;
        boolean allowCashWithdrawl = false;

        if (withdrawlAmount <= existingBalance)
        {
            allowCashWithdrawl = true;
        }
        else
        {
            allowCashWithdrawl = false;
        }

        if (allowCashWithdrawl == true){
            double newBalance = existingBalance - withdrawlAmount;
            System.out.println("New balance: euro " + newBalance);
        }
        else {
            System.out.println("Insufficient funds");
        }
    }
}