import java.util.*;
public class PowerFor{
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();//number
int b = sc.nextInt();//power
int product = 1;
for(int i=1;i<=b;i++){
product = product*a;}
System.out.println("Value of "+a+" to the power "+b+" is "+product);
}}