import java.io.File;
import java.util.Scanner;
import java.io.IOException;


public class JFT14Ex8 {
    public static void main(String[] args) {
        new JFT14Ex8().readFromFile();
    }

    public void readFromFile(){

        try{
            File myFile = new File("MyPoem.txt");
            Scanner readPoem = new Scanner(myFile);
            while(readPoem.hasNextLine()) {
                String poem = readPoem.nextLine();
                System.out.println(poem);
            }
        }
        catch (IOException io) {
            System.out.println("Unable to read file at this time");
        }
    }
}
