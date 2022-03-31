package homework;

public class break3 {
    public static void main(String[] args) {
        int a=0;
        a:for (int i=1;i<=8;i++){
            for (int x=1;x<=8;x++){
                if(i==2&&x==5){
                    break a;
                }
                a=++a;
                System.out.println("第"+i+"排"+"第"+x+"列"+":"+a);
            }
        }
    }
}
