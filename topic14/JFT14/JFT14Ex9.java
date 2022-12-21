import java.io.Writer;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.PrintWriter;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;


public class JFT14Ex9 {
    public static void main(String[] args) {

//        new JFT14Ex9().readSalesFromFile();

        SalesSummry ss1 = new SalesSummary();
        ss1.salesInt = new JFT14Ex9().readSalesFromFile();
    }

    public void salesToFile() {

        new JFT14Ex9().salesToFile();

        try {

            //Create a FileWriter object
            FileWriter fw = new FileWriter("Sales.txt");

            //Create a BufferedWriter object.
            //It requires a reference to a FileWriter object.

            BufferedWriter bw = new BufferedWriter(fw);

            //Create a PrintWriter object.
            //It requires a reference to a BufferedWriter object.
            PrintWriter pw = new PrintWriter(bw);

            //Use the PrintWriter object to write to the text file.
            pw.println("10 20 35 36\n24 12 45 1\n80 43 23 45");

            // Close the PrintWriter stream
            pw.close();

        } catch (IOException io) {
            System.out.println("Unable to read file at this time");
        }
    }

    public void readSalesFromFile(){

// into arrayList
        try{

            File sales = new File("Sales.txt");
            Scanner readSales = new Scanner(sales);
            StringBuilder totalSalesObject = new StringBuilder();
            String totalSalesString = null;

            while(readSales.hasNextLine()) {
                String salesString = readSales.nextLine();
                totalSalesObject = totalSalesObject.append(salesString + " ");
                totalSalesString = totalSalesObject.toString();
            }
            //        create int array to read into
            String[] salesList = new String[12];
            salesList = totalSalesString.split(" ");
            int[] salesInt = new int[salesList.length];
            for(int i=0; i<salesList.length; i++) {
                salesInt[i] = Integer.parseInt(salesList[i]);
            }
            return salesInt;
            //System.out.println("sales int: " + Arrays.toString(salesInt));
        }
        catch (IOException io) {
            System.out.println("Unable to read file at this time");
        }




    }

        // class/method for calculations, to string to display


}
