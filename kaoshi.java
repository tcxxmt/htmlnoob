package homework;

import java.util.Scanner;

public class kaoshi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个分数:");
        int a=sc.nextInt();

        if (a>=80&&a<90){
            System.out.println("奖励一个玩具");
        }else if (a>=90&&a<100){
            System.out.println("奖励两个玩具");
        }else if (a==100){
            System.out.println("奖励一部手机");
        }else{
            System.out.println("无奖励");
        }
        System.out.println("结束");
    }
}
