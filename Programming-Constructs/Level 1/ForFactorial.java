import java.util.*;
public class ForFactorial {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int f = 1;
for(int a = sc.nextInt();a>0;a--){
f = f*a;}
System.out.println(f);
}}