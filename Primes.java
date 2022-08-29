import java.util.*;
import java.lang.Math;
/**
   Implement a method for computing prime numbers. This method will
   compute all prime numbers up to n.
   Choose n
   Insert all numbers from 2 t n into a set
   The erase all multiples of 2 (except2) 4,6,8,10,12 ...
   Erase all mulitples of 3; 6,9,12,15
   go up to square root of n then print the set

*/
public class Primes
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Compute primes up to which integer?");
      int n = in.nextInt();
      Set <Integer> numbers = new TreeSet<>();
      // Your work goes here
      for(int i = 2; i<n; i++)
      {
          numbers.add(i);
          if(!(i==2 ||i==3))
              if(i%2==0 || i%3 == 0)
                  numbers.remove(i);
                  else if (Math.sqrt(i)%1==0)
                      numbers.remove(i);
        }
        for(int t: numbers)
        {
            System.out.println(t);
        }





   }
}
