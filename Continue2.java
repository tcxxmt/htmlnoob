package homework;

public class Continue2 {
    public static void main(String[] args) {
        for (int i=1;i<5;i++){
            for (int j=1;j<11;j++){
                if(j==1||j==10){
                    continue;
                }
                System.out.println("第"+i+"行"+"第"+j+"列");
            }
        }
    }
}
