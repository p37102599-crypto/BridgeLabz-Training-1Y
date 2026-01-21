import java.util.*;
public class HeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cm = sc.nextDouble();
        double inch = cm/2.54;
        int feet = (int)(inche/12);
        double remaining = inch%12;
        System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + remaining);
    }
}
