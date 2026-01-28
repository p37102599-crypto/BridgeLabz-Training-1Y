import java.util.*;
public class GradeMarks {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if(marks>=90){
            System.out.println("Grade = A");
        }
        else if (marks>=70){
            System.out.println("Grade = B");
        }
        else if(marks>= 60){
            System.out.println("Grade = C");
        }
        else{
            System.out.println("Fail");
        }
    }
}
