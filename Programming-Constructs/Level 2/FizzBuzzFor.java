import java.util.*;
public class FizzBuzzFor{
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
if(a>0){
System.out.println(a+" is a Positive integer");
for (int i = 1; i <= a; i++) {
if (i % 3 == 0 && i % 5 == 0) {
System.out.println("FizzBuzz");}
else if (i % 3 == 0) {
System.out.println("Fizz");}
else if (i % 5 == 0) {
System.out.println("Buzz");}
else {
System.out.println(i);}}}
else {
System.out.println("Pleasr enter a positive integer");}
}}