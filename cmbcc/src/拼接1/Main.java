package 拼接1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            solution(str);
        }
    }

    private static void solution(String str) {
        int len = str.length();
        char [] chars = str.toCharArray();
        char l = chars[0];
        String found = "";
        int maxSize = 0;
        StringBuffer stringBuffer;
        for(int i=1;i<len;i++){
            if(chars[i] == l && len%i==0){
                for(int j=i;j<=len-1;j++){
                    if(j == len-1 && chars[j] == chars[j % i]){
                        stringBuffer = new StringBuffer();
                        for(int k=i;k<j-i+1;k++){
                            stringBuffer.append(chars[k]);
                        }
                        if(stringBuffer.length() > maxSize){
                            maxSize = stringBuffer.length();
                            found = stringBuffer.toString();
                        }
                    }
                    if(chars[j] != chars[j % i]){
                        break;
                    }
                }
            }
        }
        if(found.length()>0){
            System.out.println(found);
        }
        else{
            System.out.println("false");
        }
    }
}