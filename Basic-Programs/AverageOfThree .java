import java.util.*;
public class AverageOfThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double Average = (a+b+c)/3.0;
        System.out.println("Average = " + Average);
    }
}
