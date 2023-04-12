//random
// import java.lang.*;
// public class name {
//     public static void main(String[] args) {
//         // String[] n={"yuva","jenita","yamini","jeni"};
//         int randno=(int)(Math.random()*2);
//         if(randno==0){
//         System.out.println("heads");
//     }   else{
//         System.out.println("tails");
//     }
// }}

//leap year
// import java.lang.*;
// import java.util.*;
// public class leap{
//     public static void main(String[] args){
//         Scanner s=new Scanner(System.in);
//         int n=s.nextInt();
//       //  String str=s.next().charAt(0);
//       if(n%4==0){
//           System.out.println("leap");
//       }
//       else{
//          System.out.println("not leap");
//     }
// }}

//vowel or conso
// import java.lang.*;
// import java.util.*;
// public class leap{
//     public static void main(String[] args){
//         Scanner s=new Scanner(System.in);
//         System.out.println("enter: ");
//         char str=s.next().charAt(0);
//         switch(str){
//             case 'a':
//             case 'A':
//             case 'e':
//             case 'E':
//             case 'i':
//             case 'I':
//             case 'o':
//             case 'O':
//             case 'u':
//             case 'U':
//                 System.out.println("vowel");
//                 break;
//             default:
//                 System.out.println("conso");
//         }
//     }}      





//palindrome using while loop
// import java.lang.*;
// import java.util.*;
// public class leap{
//     public static void main(String[] args){
//         Scanner s=new Scanner(System.in);
//         System.out.println("enter: ");
//         String str=s.next();
//         String rs="";
//         int l=str.length();
//         while(l>0){
//             rs=rs+str.charAt(l-1);
//             l--;
//         }
//         if(str.equals(rs)){
//             System.out.println(rs +" is a palindrome");
//         }
//         else{
//           System.out.println("not panlindrome");
//     }
// }}



// to print bwtn range 1 to 10
// import java.lang.Math;
 
// class Gfg2 {
 
//     // driver code
//     public static void main(String args[])
//     {
//         // define the range
//         int max = 10;
//         int min = 1;
//         int range = max - min + 1;
 
//         // generate random numbers within 1 to 10
//         for (int i = 0; i < 10; i++) {
//             int rand = (int)(Math.random() * range) + min;
 
//             // Output is different everytime this code is executed
//             System.out.println(rand);
//         }
//     }
// }
