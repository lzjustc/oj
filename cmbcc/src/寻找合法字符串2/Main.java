package 寻找合法字符串2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String >arrayList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            solve (n,n,new char[2*n],0);
            for(int i=0;i<arrayList.size();i++){
                System.out.print(arrayList.get(i));
                if(i != arrayList.size()-1){
                    System.out.print(",");
                }
            }
            arrayList = new ArrayList<>();
        }
        scanner.close();
    }
    public static void solve(int l, int r, char[] str, int count){

        if(l<0 || r<l) return;
        if(l==0&&r==0){
            arrayList.add(new String(str));
        }else{
            if(l>0){
                str[count]='(';
                solve(l-1, r, str, count+1);
            }
            if(r>l){
                str[count]=')';
                solve(l, r-1, str, count+1);
            }
        }
    }
    private static void solution(int n){
        ArrayList<String> arrayList = new ArrayList<>();
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0;i<n;i++){
            stringBuffer.append('(');
        }
        for(int i=0;i<n;i++){
            stringBuffer.append(')');
        }
        arrayList.add(stringBuffer.toString());
        int now = 0;
       while(stringBuffer.charAt(stringBuffer.length()-1) == ')'         &&
                stringBuffer.charAt(stringBuffer.length()-1-1) ==')') {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            stringBuffer.insert(stringBuffer.length()-n,')');
            arrayList.add(stringBuffer.toString());
        }
        for(int i=0;i<arrayList.size();i++){
           System.out.print(arrayList.get(i));
           if(i != arrayList.size()-1){
               System.out.print(",");
           }
        }

    }
}
