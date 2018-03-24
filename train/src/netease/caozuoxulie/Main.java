package netease.caozuoxulie;

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
            System.out.println(solution(arr));
        }
    }

    private static String solution(int[] arr) {
        String str = "";
        StringBuffer r=new StringBuffer();
        for(int i=1;i<=arr.length;i++){
            str = reverse(str+i);
        }
        char[] chars = str.toCharArray();
        for(char c : chars){
            r .append(arr[c - '0' - 1]);
            r.append(" ");
        }
        return r.toString().trim();
    }
    private static String reverse(String str){
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }
}
