import java.util.*;
public class SpringSeason {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
if (a==3){
if (b>=20&&b<=31){
System.out.println("Its a spring season");}
else {
System.out.println("Not a spring season");}}
else if (a==4||a==5){
System.out.println("Its a spring season");}
else if (a==6){
if(b>=1&&b<=20){
System.out.println("Its a spring season");}
else {
System.out.println("Not a spring season");}}
else {
System.out.println("Not a spring season");}
}}