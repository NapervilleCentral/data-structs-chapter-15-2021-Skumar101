import java.util.*;
import java.io.*;
/**
   Read all words from a file and add them to a
   map whose keys are word lengths and whose values
   are comma-separated strings of words of the same length.
   Then print out those strings, in increasing order by
   the length of their entries.
   Modify Worked Example 15.1.
*/
public class StringLengthMap
{
   public static void main(String[] args) throws FileNotFoundException
   {
      String filename = "test1.txt";
      int greatest = 0;
      try (Scanner in = new Scanner(new File(filename)))
      {

         // Create your map here
         Map<Integer, String> SLM = new TreeMap<>();
         

         while (in.hasNext())
         {
            String word = clean(in.next());
            Integer len = word.length();
            if(!SLM.containsKey(len))
                SLM.put(len, word+", ");
            else
                SLM.put(len, SLM.get(len)+word+", ");
            
            if(len>greatest)
                greatest = len;
            // Update the map here
            // Modify Worked Example 15.1
            


         }
            
         for(int i = 0; i<=greatest; i++)
         {
             if(SLM.containsKey(i))
             {
                 System.out.println(""+i+":"+SLM.get(i));
                }
            }
         
         // Print the strings, in increasing order of their length
         // Use this format: 1: i, a, i
      }
      catch (FileNotFoundException e)
      {
         System.out.println("Cannot open: " + filename);
      }
   }

   public static String clean(String s)
   {
      String r = "";
      for (int i = 0; i < s.length(); i++)
      {
         char c = s.charAt(i);
         if (Character.isLetter(c))
         {
            r = r + c;
         }
      }
      return r.toLowerCase();
   }

}
