package other;

public class StringPerformance {
    public static void main(String arg[]) {
        long startTime = System.nanoTime();

        String testString = "";
        for(int i=0;i<=100000;i++) 
            testString += i;

        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<=100000;i++)
            sb.append(i);

        StringBuffer sbf = new StringBuffer("");
        for(int i=0;i<=100000;i++)
            sbf.append(i);

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("It took " + totalTime/1000000 + "ms");
    }
}
