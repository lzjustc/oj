package t4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] A = new int[n];
            for(int i=0;i<n;i++){
                A[i] = scanner.nextInt();
            }

            int max = 0;
            int min = 0;
            for(int i=0;i<k;i++){
                if(A[i] > A[max]){
                    max = i;
                }
                if(A[i] < A[min]){
                    min = i;
                }
            }
            System.out.print(A[max] - A[min]);
            for(int i=k;i<n;i++){
                int low = A[i];
                int high = A[i];
                for(int j=i;j>=i-k+1;j--){
                    if(low > A[j]){
                        low = A[j];
                    }
                    if(high < A[j]){
                        high = A[j];
                    }
                }
                System.out.print(" "+(high-low));
            }

        }
        scanner.close();
    }
}
