import java.lang.*;
import java.util.*;

public class BitwiseOperations {
   public static void main(String[] args) {
      int a = 5; // binary representation: 0101
      int b = 10; // binary representation: 1010

      // perform bitwise AND
      int c = a & b; // binary representation: 0000
      System.out.println("Bitwise AND: " + c);

      // perform bitwise OR
      c = a | b; // binary representation: 1111
      System.out.println("Bitwise OR: " + c);

      // perform bitwise NOT on a
      c = ~a; // binary representation: 11111111111111111111111111111010 (32-bit representation of -6)
      System.out.println("Bitwise NOT on a: " + c);

      // perform bitwise XOR
      c = a ^ b; // binary representation: 1111
      System.out.println("Bitwise XOR: " + c);
   }
}



/*
5 and 10

Bitwise AND (&): This operation returns a value where each bit in the result is 1 
only if both the corresponding bits in a and b are 1. 
In this case, the result is 0 because the binary representation of a (0101) and b (1010) have no common 1 bits.

Bitwise OR (|): This operation returns a value where each bit in the result is 1 
if either of the corresponding bits in a and b are 1. In this case, the result is 1111 
because both a and b have 1 bits in the first and fourth positions.

Bitwise NOT (~): This operation returns a value where each bit in the result is the opposite of the corresponding bit in a.
In this case, the result is the binary representation of -6 because Java uses two's complement to represent negative integers.

Bitwise XOR (^): This operation returns a value where each bit in the result is 1 
only if one of the corresponding bits in a and b is 1, but not both. In this case, 
the result is 1111 because a and b have different bits in all four positions.

*/
