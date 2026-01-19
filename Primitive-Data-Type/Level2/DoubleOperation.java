import java.util.*;
public class DoubleOperation{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double a = sc.nextDouble();
double b = sc.nextDouble();
double c = sc.nextDouble();
double o1 = a + b *c;
double o2 = a * b + c;
double o3 = c + a / b;
double o4 = a % b +c;
System.out.println("The results of Int Operations are " + o1 + ", " + o2 + ", " + o3 + ", " + o4);
}}