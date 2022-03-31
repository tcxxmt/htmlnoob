package homework;

public class whileDemo3 {
    public static void main(String[] args) {
        double i = 0.1;
        int a = 8844430;
        int b = 0;
        while (i <= a) {
            i *= 2;
            b = b + 1;
        }
        System.out.println("折叠次数为" + b);
    }
}
