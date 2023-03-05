import java.lang.*;
import java.util.*;
/* 
Narrowing Type Casting-->
double --> float -->  long --> int --> short --> byte
<--Widening Type Casting


Widening Type Casting
 The lower data type (having smaller size) is converted into the higher data type.
 Hence there is no loss in data. 
 This is why this type of conversion happens automatically.
 Also known as Implicit Type Casting.
*/

public class TypeCasting{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter integer: ");
        int n = s.nextInt();
        float f =n;
        System.out.println(" float value of integer is " +f);
        double d= f;
        System.out.println(" double value of float is " +d);

    }
}

/*
Narrowing Type Casting
==> using the parenthesis.
==> the higher data types are converted into lower data types 
==> there is loss, done by user.
==> Explicit Type Casting.
==> int keyword inside the parenthesis indicates that 
 the num variable is converted into the int type.
*/
class Main {
  public static void main(String[] args) {
    // create double type variable
    double num = 10.99;
    System.out.println("The double value: " + num);

    // convert into int type
    int data = (int)num;
    System.out.println("The integer value: " + data);
  }
}
