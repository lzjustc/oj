package t2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String input = scanner.nextLine();
            String[] strs = input.split(":");
            double hour = Double.parseDouble(strs[0]);
            double minute = Double.parseDouble(strs[1]);
            if(hour>12){
                hour -= 12;
            }
            double argM = minute/60*360;
            double argH = hour/12*360+minute/60*30;
            double dist = Math.abs(argH - argM);
            if(dist > 180){
                dist = 360-dist;
            }
            dist *= 10;
            int mod = ( (int)dist ) % 10;
            if(mod == 0){
                System.out.println( ((int)dist)/10);
            }
            else{
                System.out.printf("%.1f\n",dist/10);
            }

        }
        scanner.close();
    }
}
