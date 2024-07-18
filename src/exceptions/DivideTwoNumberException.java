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
            if(divisor == 0) {
                throw new ZeroDivisorException("The Divisor can't be zero - Custom exception");
            }
            return dividend/divisor;
        } catch(NullPointerException np) {
            System.out.println("NullPointerException is thrown");
            np.printStackTrace();
            return 0;
        } catch(ZeroDivisorException|NumberFormatException ae) {
            System.out.println("A Number cannot be divided by Zero");
            ae.printStackTrace();
            return 0;
        } 
    }
}
