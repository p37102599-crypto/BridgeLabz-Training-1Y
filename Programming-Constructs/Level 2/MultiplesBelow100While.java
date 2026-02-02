import java.util.*;
public class MultiplesBelow100While {    
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int i=100;
if (a > 0 && a < 100) {
System.out.println("Multiples of " +a+ " below 100:");
while(i >= 1) {
if (i % a == 0) {
System.out.println(i);}
i--;}}
else {
System.out.println("Please enter a positive integer less than 100");}
}}
