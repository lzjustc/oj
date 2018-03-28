package src.netease.小易喜欢的队列;

import java.util.Scanner;

public class Main {
    static final int mod = 1000000007;
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()){
                int n = scanner.nextInt();
                int k = scanner.nextInt();
                solution(n,k);
            }
            scanner.close();
        }

    private static void solution(int n, int k) {
        int[][] dp = new int[k+1][n+1];
        dp[1][0] = 1;
        for(int i=1; i<=n; i++){
            int sum = 0;
            for(int j=1; j<=k; j++){
                sum += dp[j][i-1];
                sum %= mod;
            }

            for(int j=1;j<=k;j++){
                int sum2 = 0;
                for(int z=j+j; z<=k; z+=j){
                    sum2 += dp[z][i-1];
                    sum2 %= mod;
                }
                dp[j][i] = (sum - sum2 + mod ) % mod;
            }
        }
        int ans = 0;
        for(int j=1; j<=k; j++){
            ans += dp[j][n];
            ans %= mod;
        }
        System.out.println(ans);
    }
}
