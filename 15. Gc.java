public class Garb {
    String name; // global variable
    public static void main(String[] args) {
        //nullyifying
        Garb gc= new Garb();
        System.out.println(gc);
        gc=null;
        System.out.println(gc);

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
        System.gc();
        System.out.println("g: " +gc);
        System.out.println("g1: " +g1);
        System.out.println("g2: " +g2);

        //another manual method
        Runtime rt= Runtime.getRuntime();//singleton class
        rt.gc();
        System.out.println("free memory: " +rt.freeMemory());
        System.out.println("total memory: " +rt.totalMemory());

    }
}
