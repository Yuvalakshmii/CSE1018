//1. simple parameterised constructor/obj/class
public class Main {
  public Main(int modelYear, String modelName) {
    System.out.println(modelYear + " " + modelName);
  }
  public static void main(String[] args) {
    Main myCar = new Main(2022 , "KIA-Seltos");
  }
}
