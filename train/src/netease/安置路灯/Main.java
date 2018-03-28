package src.netease.安置路灯;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int sum =0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int t = scanner.nextInt();
            for(int i=0;i<t;i++) {
                int n = scanner.nextInt();
                String str = scanner.next();
                //(x-1)/3+1
                String[] strs = str.split("XX");
                sum = 0;
                for(String s:strs){
                    solution(s);
                }
                System.out.println(sum);
            }
        }
        scanner.close();
    }

    private static void solution(String str) {
        /*
         .xx 1  ..xx 1  xx 0
         ...xx 1
         .x.1
         ...1
              ... +1
          */
        ArrayList arrayList = new ArrayList();
        for(int i=0;i<str.length();i++){
            solve(arrayList,str.charAt(i));
        }
        for(Object c :arrayList){
            if((char)c == '.'){
                sum++;
                break;
            }
        }
    }

    private static void solve(ArrayList arrayList, char c) {
        int l =arrayList.size();
        if(c=='.'){
            if(l<2){
                arrayList.add(c);
                return;
            }
            else if((char)arrayList.get(l-1) == '.' ){
                if((char)arrayList.get(l-2) == '.'){ //...
                    arrayList.remove(l-1);
                    arrayList.remove(l-2);
                    sum++;
                }
                else //x..
                    arrayList.add(c);
            }
            else if((char)arrayList.get(l-1) == 'X' ){
                if((char)arrayList.get(l-2) == '.'){ //.X.
                    arrayList.remove(l-1);
                    arrayList.remove(l-2);
                    sum++;
                }
            }
        }
        if(c=='X'){
            if(l==0){
                arrayList.add(c);
                return;
            }
            if((char)arrayList.get(l-1) =='.'){
                arrayList.add(c);
            }
            else if((char)arrayList.get(l-1) =='X'){
                if(l==1)
                    arrayList.remove(0);
                else {
                    for (int i = l - 2; i>=0 &&(char) arrayList.get(i) == '.'; i--) {
                        arrayList.remove(i);
                    }
                    sum++;
                }
            }
        }
    }
}
