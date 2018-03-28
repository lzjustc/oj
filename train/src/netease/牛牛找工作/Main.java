package src.netease.牛牛找工作;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] arr = new int[n][2];
            for(int i=0;i<n;i++){
                arr[i][0] = scanner.nextInt();
                arr[i][1] = scanner.nextInt();
            }
            int[] a = new int [m];
            for(int i=0;i<m;i++){
                a[i] = scanner.nextInt();
            }
            Arrays.sort(arr, Comparator.comparingInt(aa -> aa[0]));
            for(int i=1;i<n;i++){
                arr[i][1] = Math.max(arr[i][1],arr[i-1][1]);
            }
            TreeMap<Integer,Integer> treeMap = new TreeMap<>();
            for(int i=0;i<n;i++){
                treeMap.put(arr[i][0],arr[i][1]);
            }
            for(int i=0;i<m;i++){
                if(treeMap.floorKey(a[i]) == null){
                    System.out.println(0);
                }
                else
                    System.out.println(treeMap.get(treeMap.floorKey(a[i]) ));
            }
        }
        scanner.close();
    }
}
