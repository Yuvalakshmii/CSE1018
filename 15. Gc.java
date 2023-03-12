public class Garb {
    String name; // global variable
    public static void main(String[] args) {
        //nullyifying 
        Garb g= new Garb();
        System.out.println(g);
        g=null;
        System.out.println(g);

        //refferencing to variable 
        Garb g1= new Garb();
        Garb g2= new Garb();
        System.out.println(g1);
        System.out.println(g2);
        g2=g1;
        System.out.println("g2: " +g2);
        System.out.println("g1: " +g1);
        
        //isolation
        g2.name= "JAVA";
        System.out.println("name: " +g2.name);
        g2=null;
        System.out.println("name_after_assigning null: " +g2.name);

        //manually calling
        System.g();
        System.out.println("g: " +g);
        System.out.println("g1: " +g1);
        System.out.println("g2: " +g2);
        
        //another manual method
        
        System.out.println("g1: " +g1);
        System.out.println("g1: " +g1);
        System.out.println("g1: " +g1);
        
        

    }
}
