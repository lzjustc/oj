package src.netease.被3整除;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            solution(l,r);
        }
        scanner.close();
    }
    private static void solution(int l , int r){
        int dis = r-l;
        int lmod = l%3;
        int dmod = dis%3;
        int sum = 0;
        sum += dis/3*2;
        int[][] arr = {
                {1,1,2},
                {0,1,2},
                {1,2,1}
        };
        sum += arr[lmod][dmod];

        System.out.println(sum);
    }
}
