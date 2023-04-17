
#OVERLOADING

//input:
yYUVA
2
SAMBAR 
RASAGULLA
//output:
Welcome YUVA!
Two-course meal
Main Dish : SAMBAR 
Dessert : RASAGULLA


//code
import java.lang.*;
import java.util.*;
class Menu {
    public void greeting(String name) {
        System.out.println("Welcome "+name+"!");
    }
    public void orderFood(String soup, String salad, String maindish, String dessert) {
        System.out.println( "Four-course meal\nSoup : "+soup+"\nSalad : "+salad+"\nMain Dish : "+maindish+"\nDessert : "+dessert);
    }
    public void orderFood(String starter, String mainDish, String dessert) {
        System.out.println("Three-course meal\nStarter : "+starter+"\nMain Dish : "+mainDish+"\nDessert : "+dessert);
    }
    public void orderFood(String mainDish, String dessert) {
        System.out.println("Two-course meal\nMain Dish : "+mainDish+"\nDessert : "+dessert);
    }
}
    public class Main {
        public static void main(String[] args) {
            Scanner s=new Scanner (System.in);
            String yourName=s.nextLine();
            int order=s.nextInt();
            Menu ob=new Menu();

            if (order==2){
            s.nextLine();
            String f3=s.nextLine ();
            String f4=s.nextLine ();
            ob.greeting(yourName);
            ob.orderFood(f3,f4);
        }
            else if (order==3) {
                
                s.nextLine();
                String f21=s.nextLine ();
                String f3=s.nextLine();
                String f4=s.nextLine();
                ob.greeting(yourName);
                ob.orderFood (f21, f3, f4);
            }
            else if (order==4) {
                
                s.nextLine();
                String f1=s.nextLine();
                String f2=s.nextLine();
                String f3=s.nextLine();
                String f4=s.nextLine();
                ob.greeting(yourName);
                ob.orderFood (f1, f2, f3, f4);
            }
            else{
                ob.greeting(yourName);
            System.out.println("Invalid Order Type");
        }
        s.close();
    }
    }
