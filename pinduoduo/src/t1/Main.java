package t1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int [] low = new int[n];
            int [] high = new int[n];
            for(int i=0;i<n;i++){
                low[i] = scanner.nextInt();
                high[i] = scanner.nextInt();
            }
            if(n<k){
                System.out.println("error");
                return;
            }
            int[] max = new int[k];
            int[] min = new int[k];
            for(int i=0;i<k;i++){
                max[i] = high[i];
                min[i] = low[i];
            }
            Arrays.sort(max);
            Arrays.sort(min);
            for(int i=k;i<n;i++){
                if(low[i] < min[k-1]){
                    min[k-1] = low[i];
                    Arrays.sort(min);
                }
                if(high[i] > max[0]){
                    max[0] = high[i];
                    Arrays.sort(max);
                }
            }
            if(min[k-1]<-50)
                min[k-1] = -50;
            if(max[0]>50)
                max[0] = 50;
            System.out.print(min[k-1]+" "+max[0]);
        }
        scanner.close();
    }
}
