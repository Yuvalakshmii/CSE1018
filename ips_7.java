import java.lang.*;
import java.util.*;
public class Main{
     int  genLife;
     public static void killTrigen(int ntri, int gl){
         int no_of_tri=ntri;
         int genlife=gl;
       
        if(gl<=0){
            return;
        }
        else{
           System.out.println("Life of TriGen " +ntri +" is now " +gl);
        
           gl=gl-25;
           killTrigen(ntri,gl);
        }
     }
         
    
     public void searchForValerie(int ntri){
            int genlife=100;
         for(int i=1;i<=ntri;i++){
             killTrigen(i,genlife);
               System.out.println("KILLED TRIGEN "+i);
     
         }       System.out.println("RESCUED VALERIE! MISSION PASS!!!");
     }
     public static void main(String[] args){
         Scanner s= new Scanner(System.in);
         int no_of_tri=s.nextInt();
         Main obj=new Main();
         obj.searchForValerie(no_of_tri);
     }
}
