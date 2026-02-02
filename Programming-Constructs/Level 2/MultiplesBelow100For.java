import java.util.*;
public class MultiplesBelow100For {    
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
if (a > 0 && a < 100) {
System.out.println("Multiples of " +a+ " below 100:");
for (int i = 100; i >= 1; i--) {
if (i % a == 0) {
System.out.println(i);}}}
else {
System.out.println("Please enter a positive integer less than 100");}
}}
