import java.util.*;
public class GreatestFactorFor{
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int c=0;
for(int i=1;i<a;i++){
if(a%i==0){
	int b=i;
	if(b>c){
     c=b;}}}
System.out.println("Largest factor : "+c);}}