import java.util .*;
import java.lang.*;
public class ArithmeticOp {
    public static void main(String[] args) {
        int a,b,n;
        while(true) {
            Scanner s= new Scanner(System.in);
            System.out.println("\n1.add\n2.sub\n3.multi\n4.divi\n5.modulus\n6.exit\n");
            System.out.println("choose op (1/2/3/4/5): ");
            n= s.nextInt();
            if (n==6) {
                System.out.println("End of program!");
                break;
            }
            System.out.println("Enter 1st number: ");
            a =s.nextInt();
            System.out.println("Enter 2nd number: ");
            b = s.nextInt();
            switch(n) {
        case 1:
            System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            case 5:
                System.out.println(a%b);
                break;
            }
        }
    }
}
