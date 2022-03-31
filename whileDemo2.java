package homework;

public class whileDemo2 {
    public static void main(String[] args) {
        int i = 1;
        int a = 0;
        while (i <= 5) {
            a+=i;
            i++;
        }
        System.out.println("结果为"+a);
    }
}
