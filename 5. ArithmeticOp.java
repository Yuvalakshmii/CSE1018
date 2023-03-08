//1st method 
import java.util.Scanner;
public class Calculate 
{
    public static void main(String[] args) 
    {
        int m, n, opt, add, sub, mul;
        double div;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number:");
        m = s.nextInt();
        System.out.print("Enter second number:");
        n = s.nextInt();
        while(true)
        {
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            System.out.println("Enter 5 to Exit");
            opt = s.nextInt();
            switch(opt)
            {
                case 1:
                add = m + n;
                System.out.println("Result:"+add);
                break;
 
                case 2:
                sub = m - n;
                System.out.println("Result:"+sub);
                break;
 
                case 3:
                mul = m * n;
                System.out.println("Result:"+mul);
                break;
 
                case 4:
                div = (double)m / n;
                System.out.println("Result:"+div);
                break;    
 
                case 5:
                System.exit(0);
            }
        }
    }
}

// 2nd method 
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
