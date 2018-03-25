package src.netease.独立的小易;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            long x = scanner.nextLong();
            long f = scanner.nextLong();
            long d = scanner.nextLong();
            long p = scanner.nextLong();
            long r = d/x < f ? d/x : (d+f*p)/(p+x);
            System.out.println(r);
        }
    }
}
