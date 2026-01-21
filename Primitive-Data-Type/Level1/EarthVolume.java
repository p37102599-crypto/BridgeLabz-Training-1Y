import java.util.*;
public class EarthVolume {
    public static void main(String[] args) {
        double r = 6378;
        double volm = (4/3)*3.14*r*r*r;
        double volmMiles = volm * 0.239913;
        System.out.println("The volume of earth in cubic kilometers is " + volm + " and cubic miles is " + volmMiles);
    }
}
