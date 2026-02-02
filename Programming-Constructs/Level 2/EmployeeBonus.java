import java.util.*;
public class EmployeeBonus {
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();//Salary
int b = sc.nextInt();//Year
if(b>5){
double bonus = 0.05*a;
System.out.println("Bonus : "+bonus);}
}}