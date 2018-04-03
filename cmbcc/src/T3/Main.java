package T3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()){
                int n = scanner.nextInt();
                    solution(n);
            }
            scanner.close();
        }
    private static void solution(int n){
        int mod = n%2;
        if(mod == 0){
            System.out.println((int)(Math.pow(3,n/6*2)*Math.pow(2,n%6/2)));
        }
        else{
            System.out.println((int)(Math.pow(3,(n-3)/6*2+1)*Math.pow(2,(n-3)%6/2)));
        }

    }
}
