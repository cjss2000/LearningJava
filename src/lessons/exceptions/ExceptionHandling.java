package lessons.exceptions;

public class ExceptionHandling {

    // TASK: accept two numbers, and return their sum, but throw an exception if the sum = 13, because 13 is an unlucky number
//    public static int getSum(int x, int y) throws Exception {
//        int sum = x + y;
//        if (sum == 13) {
//            throw new Exception("Unlucky number 13!");
//        } else {
//            return sum;
//        }
//    }

    public static int getSum(int x, int y) throws Unlucky13Exception {
        int sum = x + y;
        if (sum == 13) {
            throw new Unlucky13Exception("Unlucky number 13!");
        } else {
            return sum;
        }
    }

    public static void main(String[] args) {

        try {
            int x = 10;
            int y = 2;
            System.out.println(x / y);

            String text = null;
            System.out.println(text.length());
        }
        // YOU CAN GO FOR IT, but it's not a best practice:
//        catch(Exception exception) {
//            if(exception instanceof ArithmeticException){
//                System.out.println("Division by zero is not allowed");
//            }
//            if(exception instanceof NullPointerException){
//                System.out.println("Do not access null values!");
//            }
//        }
        catch (ArithmeticException exception) {
            System.out.println("Division by zero is not allowed");
        } catch (NullPointerException exception) {
            System.out.println("Do not access null values!");
        }

        System.out.println("ABC");

        try {
            getSum(10, 3);
        } catch (Unlucky13Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
