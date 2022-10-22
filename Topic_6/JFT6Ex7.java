//Write a Java program to determine if a salesperson is entitled to a commission bonus or not.
// A salesperson is entitled to a bonus, if he/she has sold 1,000 or more products, has 20 or
//more years’ service and has accumulated sales for the year to date of €10,000 or over.
// Make use of variables as part of your solution and store sample values. Test your solution.

public class JFT6Ex7 {

    public static void main(String[] args) {

        int productsSold;
        int yearsService;
        double salesYtd;

        productsSold = 900;
        yearsService = 30;
        salesYtd = 15000.00;

        if (productsSold >= 1000 && yearsService >= 20 && salesYtd >= 10000.00) {
            System.out.println("Bonus Approved");
        }
        else {
            System.out.println("No bonus");
        }

    }
}