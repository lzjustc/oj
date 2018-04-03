package src.pinduoduo.大整数相乘;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String input = scanner.nextLine();
            String [] strings = input.split(" ");
            String s1 = strings[0].trim();
            String s2 = strings[1].trim();
            solution(s1,s2);
        }
    }

    private static void solution(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        int[] n1 = new int [l1];
        int[] n2 = new int [l2];
        int[] r = new int[l1+l2];
        for(int i=0;i<l1;i++){
            n1[i] = s1.charAt(l1-1-i) - '0';
        }
        for(int i=0;i<l2;i++){
            n2[i] = s2.charAt(l2-1-i) - '0';
        }
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                r[i+j] += n1[i] * n2[j];
            }
        }
        for(int i=0;i<l1+l2-1;i++){
            if(r[i]>9){
                r[i+1] += r[i]/10;
                r[i] %= 10;
            }
        }
        boolean f = false;
        for(int i=l1+l2-1;i>=0;i--){
            if(!f){
                if(r[i] != 0){
                    f = true;
                }
                if(r[i] == 0){
                    continue;
                }
            }
            System.out.print(r[i]);
        }
    }
}
