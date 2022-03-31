package homework;

import java.util.Scanner;

public class for4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int x=1;
        int y=1;
        int z=0;
        System.out.println("输出n个斐波那契数");
        System.out.print(x+"\t"+y+"\t");
        for (int i=1;i<=a;i++){
            z=x+y;
            x=y;
            y=z;
            System.out.print(z+"\t");
            if ((i+2)%5==0)
                System.out.println();
        }
    }
}
