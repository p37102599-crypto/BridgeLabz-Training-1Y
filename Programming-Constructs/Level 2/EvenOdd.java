import java.util.*;
public class EvenOdd{
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
for(int b=1;b<=a;b++){
if(b%2==0){
System.out.println("Even : "+b);}
else {
System.out.println("Odd : "+b);}
}}}