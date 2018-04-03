package src.netease.迷路的牛牛;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int N = scanner.nextInt();
            String str = scanner.next();
            char[] chars = new char [N];
            for(int i=0;i<N;i++){
                chars[i]=str.charAt(i);
            }
            solution(chars);
        }
        scanner.close();
    }
    private static void solution(char[] chars){
        char[] dir = {'N','E','S','W'};
        int status =0;
        for(int i=0;i<chars.length;i++){
            if(chars[i] == 'L'){
                status = (status + 3) % 4;
            }
            if(chars[i] == 'R'){
                status = (status+1) % 4;
            }
        }
        status %= 4;
        System.out.println(dir[status]);
    }
}