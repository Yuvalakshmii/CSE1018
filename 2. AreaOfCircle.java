//area of circle
import java.lang.*;
import java.util.*;
public class AreaOfCircle{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter radius: ");
        double r = s.nextInt();
        System.out.println(Math.PI*r*r);
        // instead of pi=3.14, using math module (Math.PI)
    }
}
