package homework;

import java.util.Scanner;

public class panduan {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a=x.nextInt();
        if(a%2==0){
            System.out.println(a+"是偶数");
        }else{
            System.out.println(a+"是奇数");
        }
    }
}
