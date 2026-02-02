import java.util.*;
public class FizzBuzzWhile{
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int i = 1;
if(a>0){
System.out.println(a+" is a Positive integer");
while(i<=a) {
if (i % 3 == 0 && i % 5 == 0) {
System.out.println("FizzBuzz");}
else if (i % 3 == 0) {
System.out.println("Fizz");}
else if (i % 5 == 0) {
System.out.println("Buzz");}
else {
System.out.println(i);}
i++;}}
else {
System.out.println("Pleasr enter a positive integer");}
}}