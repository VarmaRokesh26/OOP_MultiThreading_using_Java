package generic2;

import java.util.*;
public class GenericApp {
    public static void main(String arg[]) {
        ArrayList<Integer> lotteryNumbers = new ArrayList<>(Arrays.asList(23, 14, 45, 78, 69, 65));
        GenericFunction.addNumber(lotteryNumbers);
        GenericFunction.printList(lotteryNumbers);
        GenericFunction.displayToString(lotteryNumbers);
    }
}
