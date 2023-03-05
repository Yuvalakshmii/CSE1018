import java.lang.*;
import java.util.*;

public class TypeCasting{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter x value: ");
        double x = s.nextDouble();
        double e= 7* Math.pow(x,3) + 4*Math.pow(x,2) + 1;
        System.out.println(e);
    }
}
