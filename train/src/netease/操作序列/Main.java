package src.netease.操作序列;

import java.util.Scanner;

/**
 * @author : Li Zhijun
 * @email : ustclzj@foxmail.com
 * @description :
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            solution(arr);
        }
    }


    private static void solution(int[] arr) {
        int len = arr.length;
        int[] r = new int[len];
        int mod = len % 2;
        r[len/2] = arr[0];
        for(int i=0,j=len-1;i<len/2;i++,j-=2) {
            r[i] = arr[j];
        }
        for (int i=len/2+mod,j=mod; i < len; i++, j += 2) {
            r[i] = arr[j];
        }
        for(int i=0;i<len;i++){
            System.out.print(r[i]);
            if(i != len-1){
                System.out.print(" ");
            }
        }
    }
}

