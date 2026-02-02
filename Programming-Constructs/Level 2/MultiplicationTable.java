import java.util.*;
public class MultiplicationTable {
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
for(int b=6;b<=9;b++){
int product = a*b;
System.out.println(a+"*"+b+"="+product);}
}}