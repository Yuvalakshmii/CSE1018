import java.lang.*;
import java.util.*;
public class BinToHex{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter binary digit: ");
        
        // to get binary number "Integer.parseInt(s.nextLine(),2)"
        int b=Integer.parseInt(s.nextLine(),2);
        
        //to convert to hex use "Integer.toHexString()"
        
        String h=Integer.toHexString(b);
        System.out.println(h);
    }
}
   
