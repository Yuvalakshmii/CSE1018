//1. simple parameterised constructor/obj/class -- OBJ USING "NEW" KEYWORD
public class Main {
  public Main(int modelYear, String modelName) {
    System.out.println(modelYear + " " + modelName);
  }
  public static void main(String[] args) {
    Main myCar = new Main(2022 , "KIA-Seltos");
  }
}

//2. OBJ USING ANONYMOUS WAY
public class Stu{
    public void insert(int r, String n){
        System.out.println(r +" "+n);
    }
    public static void main(String[] args){
       new Stu().insert(111, "karan");
       new Stu().insert(222, "Aryan");
    }
}
