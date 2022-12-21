
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class JFT14Ex7 {
    public static void main(String[] args) {

//
        new JFT14Ex7().writeToFile();
    }

    public void writeToFile(){

//        boolean completionStatus = false;
//
//        while (completionStatus == false) {
        File file = new File("My Poem.txt");
            try {
                FileWriter myFile = new FileWriter("MyPoem.txt");
                //Create a FileWriter object
                FileWriter fw = new FileWriter(file,true);

                //Create a BufferedWriter object.
                //It requires a reference to a FileWriter object.

                BufferedWriter bw = new BufferedWriter(fw);

                //Create a PrintWriter object.
                //It requires a reference to a BufferedWriter object.
                PrintWriter pw = new PrintWriter(bw);

                //Use the PrintWriter object to write to the text file.
                pw.println("The quick brown fox jumped over the moon.");
                pw.println("As he leapt, he looked back over his shoulder and cried aloud,");
                pw.println("Hello World!");

                System.out.println("Success!");

                // Close the PrintWriter stream
                pw.close();

            } catch (IOException e) {
                System.out.println("Unable to write to the file at this time");
        }
    }
}
