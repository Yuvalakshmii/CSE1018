import java.lang.*;
import java.util.*;

public class Weird {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        while(true) {
    
            System.out.println("enter an int: ");
            int n=s.nextInt();
            if(n==0) {
                break;}
            if(n%2==0) {
                if(n>=2 && n<=5) {
                    System.out.println("U");
                }
                if(n>=6 && n<=20) {
                    System.out.println("Y");
                }
                if(n>20) {
                    System.out.println("X");
                }
            }
            else {
                System.out.println("weird");
            }


        }
    }
}
