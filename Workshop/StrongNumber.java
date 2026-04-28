import java.util.*;
public class StrongNumber{
    static void main() {
        Scanner sc = new Scanner(System.in);
        int original  = sc.nextInt(); 
        int temp = original;
        int factSum = 0;  
        while(temp > 0){
            int rem = temp %10; 
            int fact  = 1;
            for(int i = 1; i<= rem; i++){
                fact = fact * i;  
            }
            factSum += fact;  
            temp = temp / 10; 
        }
        if(factSum == original) System.out.println("Strong number");
        else System.out.println("not a Strong number");
    }
}