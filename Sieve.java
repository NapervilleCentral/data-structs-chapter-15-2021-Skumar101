import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
   A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{  
   public static void main(String[] args)
   { 
      Scanner in = new Scanner(System.in);
      System.out.println("Compute primes up to which integer?");
      int n = in.nextInt();
      Set<Integer> s = new TreeSet<>();
     

      System.out.println(s);
   }
}
