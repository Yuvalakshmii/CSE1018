import java.lang.*;
import java.util.*;

public class Main{
      int roll_no;
      String name;
    static String fac;
    
    static{
        fac="Divya";
    }
    public void getDetails(int rn, String n){
        this.roll_no=rn;
        this.name=n;
    }
    public void printDetails(){
        

        System.out.println("Name: "+name);
        System.out.println("Rollno: "+roll_no);
        System.out.println("Faculty: "+fac);
    }
    public static void main(String[] args){
         Main oj1= new Main();
         Main oj2= new Main();
         Scanner s=new Scanner(System.in);
        
        String name2=s.next();
        int roll_no2=s.nextInt();
        oj1.getDetails(roll_no2,name2);
        String name1=s.next();
        int roll_no1=s.nextInt();
    
        oj2.getDetails(roll_no1,name1);
        //oj1.printDetails();
        
        
        System.out.println("MY PROFILE");
         oj1.printDetails();
        System.out.println("MY FRIEND's PROFILE");
        oj2.printDetails();
        
    }
}
