package homework;

import java.util.Random;
import java.util.Scanner;

public class ran2 {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(100) + 1;
        for (int i = 0; i <= 1; ) {
            Scanner sc = new Scanner(System.in);
            int b = sc.nextInt();

            if (b > a) {
                System.out.println("你猜的数据大了");
            }
            if (b < a) {
                System.out.println("你猜的数据小了");
            }
            if (b == a) {
                System.out.println("恭喜你猜中了");
                break;
            }
        }
    }
}
