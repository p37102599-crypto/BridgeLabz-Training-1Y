import java.util.*;
public class PowerWhile{
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();//number
int b = sc.nextInt();//power
int product = 1;
int i = 1;
while(i<=b){
product = product*a;
i++;}
System.out.println("Value of "+a+" to the power "+b+" is "+product);
}}