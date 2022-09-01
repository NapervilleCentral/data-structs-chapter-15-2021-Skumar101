import java.util.Scanner;
import java.util.Stack;
/**
   Class for splitting an integer into its individual digits.
*/
public class IntegerSplitter
{
   /**
      Splits the given integer into its individual digits
      and prints them to the screen.
      @param number Integer to be split.
   */
   public static void split(int number)
   {
      Stack <Integer> splitNums = new Stack<>();
     while(number!=0) {
         splitNums.add(number%10);
         number/=10;
     }
     int size = splitNums.size();
     for(int i=0; i<size; i++)
     {
         System.out.print(splitNums.pop() + " ");
   }
}
}