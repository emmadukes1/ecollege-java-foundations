public class JFT14Ex1 {
    public static void main(String[] args) {
        String value = "two";
        int parsedValue = 0;

        try{
            parsedValue = Integer.parseInt(value);
        }
        catch(NumberFormatException e){
            System.out.println("Error unable to parse data. Program closing");
        }
    }
}
