import java.lang.*;
import java.util.*;
class Pattern{
  public static void main{
    Scanner s =new Scanner(System.in);
    System.out.println("enter no of lines:");
    int n=s.nextInt();
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.println("* ");
      }
    }
  } 
}
