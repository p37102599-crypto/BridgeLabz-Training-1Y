import java.util.*;
public class Palindrome{
    static void main() {
        Scanner sc = new Scanner(System.in);
        long num  = sc.nextLong();
        long temp = num; 
        long rev = 0;
        while(temp >  0){
            long rem = temp % 10;  
            rev = rev *10 + rem;  
            temp = temp /10;    
        }
        if(rev == num) System.out.println("Palidrome");
        else System.out.println("not Palindrome");
    }
}
