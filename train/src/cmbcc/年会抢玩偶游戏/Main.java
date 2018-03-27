package src.cmbcc.年会抢玩偶游戏;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            solution(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        }
        scanner.close();
    }
    private static void solution(int n, int m, int k){
        //n个人 m个玩偶 k位置
        if(k == 0 || n == 0 || k>n){
            System.out.println(0);
            return;
        }
        if(n == 1 ){
            System.out.println(m);
            return;
        }
        int left = k-1;
        int right = n-k;
        int sqrtM = (int)Math.sqrt(m);
        if(left >= sqrtM-1 && right>=sqrtM-1){
            System.out.println(sqrtM);
            return;
        }
        if(left < sqrtM-1 && right >= sqrtM -1){
            int sum = left+1;
            int d = right-left;
            int sp = 0;
            int z=1;
            while(d-->0){
                sp+=z++;
            }
            int nM = m + sp ;
            int sqrtNM = (int)Math.sqrt(nM);
            if(right>sqrtNM-1){
                System.out.println(sqrtNM);
                return;
            }
            System.out.println(right+1);
            return;
        }
        if(right < sqrtM-1 && left >= sqrtM -1){
            int sum = right+1;
            int d = left-right;
            int sp = 0;
            int z=1;
            while(d-->0){
                sp+=z++;
            }
            int nM = m + sp ;
            int sqrtNM = (int)Math.sqrt(nM);
            if(left>sqrtNM-1){
                System.out.println(sqrtNM);
                return;
            }
            System.out.println(left+1);
            return;
        }


    }
}
