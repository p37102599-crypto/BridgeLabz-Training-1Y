import java.util.*;
public class UseOfContinue {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();
        for(int i =1;i<=n;i++){
            if(i%2==0){
                continue;
            }else{
                System.out.println(i);
            }
        }
    }
}