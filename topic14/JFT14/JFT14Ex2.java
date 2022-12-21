public class JFT14Ex2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int result = 0;

        System.out.println(num1/num2);

//        this try catch is not required for arithmetic exception as it is an unchecked runtime exception
    try{
            result = num1/num2;
            System.out.println(result);
        }
        catch(ArithmeticException ae){
            System.out.println("Err orr arithmethic exception blahhhhh");
        }
    }
}
