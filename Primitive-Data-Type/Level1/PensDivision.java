import java.util.*;
public class PensDivision {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;
        int distributed = pens / students;
        int remaining = pens % students;
        System.out.println("The Pen Per Student is " + distributed + " and the remaining pen not distributed is " + remaining);
    }
}
