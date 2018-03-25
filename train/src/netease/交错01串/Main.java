package netease.jiaocuo01chuan;

import java.util.Scanner;

/**
 * @author : Li Zhijun
 * @email : ustclzj@foxmail.com
 * @description :如果一个01串任意两个相邻位置的字符都是不一样的,我们就叫这个01串为交错01串。例如: "1","10101","0101010"都是交错01串。
小易现在有一个01串s,小易想找出一个最长的连续子串,并且这个子串是一个交错01串。小易需要你帮帮忙求出最长的这样的子串的长度是多少。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.next();
            System.out.println(solution(s));

        }
        scanner.close();
    }

    private static int solution(String s) {
        int len = s.length();
        if(len == 1)
            return 1;
        char [] arr = s.toCharArray();
        int max = 1;
        char now = arr[0];
        int l = 1;
        for(int i=1;i<len;i++){
            if(now==arr[i]){
                max = l>max?l:max;
                l = 1;
            }
            else {
                l++;
                now = arr[i];
            }
            if(i==len-1){
                max = l>max?l:max;
            }
        }
        return max;
    }
}
