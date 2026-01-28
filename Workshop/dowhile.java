import java.util.*;
public class dowhile{
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
    }
}