package src.netease.疯狂队列;

import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] h = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = scanner.nextInt();
            }
            solution(h,n);
        }
        scanner.close();
    }

    private static void solution(int[] h,int n) {
        Arrays.sort(h);
        Deque<int>
    }
    private static void solution1(int[] h,int n){
        Arrays.sort(h);
        int [] arr = new int[n];
        int i=0,j=n-2;
        int p1=n/2-2,p2=n/2+1;
        arr[n/2] = h[n-1];
        arr[n/2-1] = h[0];
        if(n%2 ==0) {
            while (p1 >= 0 && p2 < n) {
                arr[p1--] = h[i++];
                arr[p2++] = h[i++];
                if (p1 >= 0)
                    arr[p1--] = h[j--];
                if (p2 <= n - 1)
                    arr[p2++] = h[j--];
            }
        }
        else{

        }

        System.out.println( crazy(arr));
    }
    private static int crazy(int[] arr){
        int n=arr.length;
        int sum = 0;
        for(int i=0;i<n-1;i++){
            sum += Math.abs(arr[i]-arr[i+1]);
        }
        return sum;
    }
}
