
import java.util.*;
public class MethodOverloadingExample {
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a , int b , int c){
        return a+b+c;
    }
    public static void main(String args[]){
        int result = add(10,20);
        System.out.println(result);
    }
}
