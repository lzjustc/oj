package src.netease.堆棋子;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            long[] x = new long[n];
            long[] y = new long[n];
            for (int i = 0; i < n; i++) {
                x[i] = scanner.nextLong();
            }
            for (int i = 0; i < n; i++) {
                y[i] = scanner.nextLong();
            }
            solution(n, x, y);
        }
        scanner.close();
    }

    private static void solution(int n, long[] x, long[] y) {
        long min;
        for (int i = 1; i <= n; i++) {
            long [] minArr = new long[i];
            min = Long.MAX_VALUE;
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    for(int temp=0;temp<i;temp++) {
                        minArr[temp] = Long.MAX_VALUE;
                    }
                    for(int m=0;m<n;m++) {
                        long dis = distance(x[m], y[m], x[j], y[k]);
                        if (dis < minArr[i - 1]) {
                            minArr[i - 1] = dis;
                            Arrays.sort(minArr);
                        }
                    }
                    long sum = 0;
                    for(int q=0;q<i;q++){
                        sum+=minArr[q];
                    }
                    if(sum<min){
                        min = sum;
                    }
                }
            }
            System.out.print(min);
            if(i != n)
                System.out.print(" ");
        }
    }

    private static long distance(long x1,long y1,long x2, long y2){
        return Math.abs(x1-x2)+Math.abs(y1-y2);
    }
}
