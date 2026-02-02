import java.util.*;
public class WhileFactorial {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int f = 1;
while(a>0){
f = f*a;
a--;}
System.out.println(f);
}}