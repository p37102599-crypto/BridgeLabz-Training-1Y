import java.util.*;
public class ValidationOfVote {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not Eligible to vote");
        }
    }
}
