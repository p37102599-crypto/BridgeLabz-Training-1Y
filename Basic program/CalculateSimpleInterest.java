import java.util.*;
public class CalculateSimpleInterest{
public static void main(){
Scanner scanner = new Scanner(System.in);
        double principal = scanner.nextDouble();
        double rate = scanner.nextDouble();
        double time = scanner.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
		 System.out.println("Simple Interest = " + simpleInterest);
    }
}