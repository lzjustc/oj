package t3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int[] x = new int[n];
            int[] y = new int[n];
            for(int i=0;i<n;i++){
                x[i] = scanner.nextInt();
                y[i] = scanner.nextInt();
            }
            int sum=0;
            for(int i=0;i<n-2;i++){
                for(int j=i+1;j<n-1;j++){
                    for(int k=j+1;k<n;k++){
                        if(x[i] == x[j] && x[i] == x[k]){
                            continue;
                        }
                        if(y[i] == y[j] && y[i] == y[k]){
                            continue;
                        }
                        double grad1 = ((double)y[i] - y[j])/(x[i] - x[j]);
                        double grad2 = ((double)y[i] - y[k])/(x[i] - x[k]);
                        if(grad1 != grad2){
                            sum++;
                        }
                    }
                }
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}
