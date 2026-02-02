import java.util.*;
public class FactorsWhile{
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int i = 1;
System.out.println("Factors -");
while(i<a){
if(a%i==0){
System.out.println(i);}
i++;}
}}