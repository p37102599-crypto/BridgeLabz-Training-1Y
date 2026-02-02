import java.util.*;
public class GreatestFactorWhile{
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int i = 1;
int c = 0;
while(i<a){
if(a%i==0){
	int b = i;
	if(b>c){
	c=b;}}
i++;}
System.out.println("Greatest factor : "+c);
}}