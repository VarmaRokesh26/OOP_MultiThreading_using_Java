package exceptions;

public class DivideTwoNumberException {
    public static void main(String arg[]) {
        System.out.println(divideTwoNumber(10, 5));
        System.out.println(divideTwoNumber(20, 2));
        System.out.println(divideTwoNumber(30, 0));
        System.out.println("Job is Finished");
    }

    public static int divideTwoNumber(int dividend, int divisor) {
        try {
            return dividend/divisor;
        } catch(NullPointerException np) {
            System.out.println("NullPointerException is thrown");
            np.printStackTrace();
            return 0;
        } catch(ArithmeticException ae) {
            System.out.println("A Number cannot be divided by Zero");
            ae.printStackTrace();
            return 0;
        } 
        // finally {
        //     System.out.println("Exception will be Handled");
        // }
    }
}
