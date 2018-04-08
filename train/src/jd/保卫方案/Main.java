package src.jd.保卫方案;

import java.util.BitSet;
import java.util.Scanner;

public class Main {
    private static int n;
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()){
                int n = scanner.nextInt();
                Main.n = n;
                int sum = 0;
                int [] arr = new int[n];
                for(int i=0;i<n;i++){
                    arr[i] = scanner.nextInt();
                }
                BitSet bs = new BitSet();
//                int[][] dp = new int [n][n];
//                byte[][] dp1 = new byte[n][n];
                for(int i=0; i<n;i++){
                    int rmax = arr[rightItem(i)];
                    int lmax = arr[leftItem(i)];
                    for(int j=rightItem(i); j != i ;j=rightItem(j)){
                        if(arr[j] >= rmax) {
//                            dp[i][j] = 1;
//                            dp1[i][j] = 1;
                            bs.set(i*n+j);
                        }
                        rmax = Math.max(arr[j],rmax);
                    }
                    for(int j=leftItem(i); j!= i; j=leftItem(j)){
                        if(arr[j] >= lmax){
//                            dp[i][j] = 1;
//                            dp1[i][j] = 1;
                            bs.set(i*n+j);
                        }
                        lmax = Math.max(arr[j],lmax);
                    }
//                    for(int j=0;j<n;j++){
//                        sum+=dp1[j];
//                    }
                }
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
//                        if(dp[i][j] == 1 && dp[j][i] == 1){
//                            sum ++;
//                        }
//                        if(dp1[i][j] == 1 && dp1[j][i] == 1){
//                            sum ++;
//                        }
                        if(bs.get(i*n+j) && bs.get((j*n+i))){
                            sum ++;
                        }
                    }
                }

                System.out.println(sum/2);
            }
            scanner.close();
        }
    private static int  leftItem(int i){
        return (i-1+n) % n;
    }
    private static int  rightItem(int i){
        return (i+1) % n;
    }
    private static void init(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i] = 0;
        }
    }
}
