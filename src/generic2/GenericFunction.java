package generic2;
import java.util.*;
public class GenericFunction {

    public static <T> void displaToString(T typeData) {
        System.out.println(typeData.toString());
    }

    public static void addNumber(ArrayList<? super Integer> list) {
        for(int i=0;i<=10;i++) {
            list.add(i);
        }
    }

    public static void printList(ArrayList<?> list) {
        for(Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();   
    }
}
