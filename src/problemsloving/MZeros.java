package problemsloving;

import java.util.Scanner;

public class MZeros {
    

    public static int countTrailingZeros(int N) {
        int count = 0;
        while(N > 0) {
            N /= 5;
            count += N;
        }
        return count;
    }
    
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int low = 0, high = 5 * m;

        while(low < high) {
            int mid = (low + high) / 2;
            if(countTrailingZeros(mid) < m) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        int start = low;
        while(countTrailingZeros(start) == m) {
            System.out.print(start + " ");
            start ++;
        }
        sc.close();
    }
}
