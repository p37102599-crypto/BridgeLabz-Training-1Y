import java.util.*;
 public class ArrayDeclareExample {
  public static void main() {
     int marks[] = {10,20,30,40,50};
System.out.println("Array Elements : ");
      for(int i=0;i<marks.length;i++){
      System .out.println(marks[i]);
	 }
	 marks[3]=100;
	 System.out.println("New Array Elements : ");
	 for(int i=0;i<marks.length;i++){
	 System.out.println(marks[i]);
	 }
  }
 }