public class JFT14Ex3 {
    public static void main(String[] args) {

//        not definitively required by the compiler to as it's a runtime exception, but good to do
        byte[] numbers = {6,5,4,3,2,1};

        try{
        System.out.println(numbers[2500]);
        }
        catch(ArrayIndexOutOfBoundsException aex){
            System.out.println("Errorr blah blahhhh");
        }
    }
}
