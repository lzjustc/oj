package src.cmbcc.不想出差的HR;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.next().toString();
            String[] strs = str.split(",");
            int a =Integer.parseInt(strs[0]);
            int b = Integer.parseInt(strs[1]);
            int c = Integer.parseInt(strs[2]);
            solution(a,b,c);
        }
        scanner.close();
    }
    private static void solution(int a, int b, int c){
        int xor = a^b^c;
        if(xor == 0){
            System.out.println(1);
            return;
        }
        compare(a,b,c,2);
        compare(a,c,b,1);
        compare(b,c,a,0);
    }
    private static void compare(int a,int b, int c,int seq){
        String[] s = {"A,","B,","C,"};
        if( (a^b) < c){
            System.out.println(s[seq]+(c-(a^b)));
        }
    }
}
