package src.netease.疯狂队列;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] h = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = scanner.nextInt();
            }
            solution(h,n);
        }
        scanner.close();
    }

    private static void solution(int[] h,int n) {
        Arrays.sort(h);
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(h[n-1]);
        int i=0;
        int j=n-2;
        while(i<j){
            linkedList.addFirst(h[i++]);
            if(i>=j)break;
            linkedList.addLast(h[i++]);
            linkedList.addFirst(h[j--]);
            if(i>=j)break;
            linkedList.addLast(h[j--]);
        }
        LinkedList linkedList1 = (LinkedList) linkedList.clone();
        if(i==j){
            linkedList.addLast(h[i]);
            linkedList1.addFirst(h[i]);
        }
        int r = Integer.max(crazy(linkedList),crazy(linkedList1));
        System.out.println(r);
    }
    private static int crazy(LinkedList<Integer> linkedList){
        int [] arr = new int[linkedList.size()];
        int i=0;
        for(int x:linkedList){
            arr[i++]=x;
        }
        return crazy(arr);
    }
    private static int crazy(int[] arr){
        int n=arr.length;
        int sum = 0;
        for(int i=0;i<n-1;i++){
            sum += Math.abs(arr[i]-arr[i+1]);
        }
        return sum;
    }
}
