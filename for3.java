package homework;

import java.util.Scanner;

public class for3 {
    public static void main(String[] args) {
        for (int i=100;i<=999;i++){
            int a,b,c;
            a=i%10;
            b=i/10%10;
            c=i/10/10%100;

            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println(i+"是一个水仙数");
            }

        }
    }
}
