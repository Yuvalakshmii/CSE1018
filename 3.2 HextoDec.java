import java.lang.*;
import java.util.*;
public class HextoDec{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter number: ");
        String hex = s.nextLine();
        int n=Integer.parseInt(hex,16);
        System.out.println("decimal number of " +hex + " is "+ n);
    
    }
}
