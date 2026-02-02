import java.util.*;
public class ForCompare {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int formulasum = a*(a+1)/2;
int loopsum = 0;
for(int b=a;b>0;b--){
loopsum = loopsum + b;}
if(formulasum==loopsum){
System.out.println("Both are equal");}
else{
System.out.println("Not equal");}
}}