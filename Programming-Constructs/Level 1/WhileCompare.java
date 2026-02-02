import java.util.*;
public class WhileCompare {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int formulasum = a*(a+1)/2;
int loopsum = 0;
while(a>0){
loopsum = loopsum + a;
a--;}
if(formulasum==loopsum){
System.out.println("Both are equal");}
else{
System.out.println("Not equal");}
}}