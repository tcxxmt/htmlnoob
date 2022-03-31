package homework;

public class for2 {
    public static void main(String[] args) {
        int i=0;
        for (int a=2;a<=100;a++){
            if(a%2==0) {
                i+=a;
            }
        }
        System.out.println("结果为："+i);
    }
}
