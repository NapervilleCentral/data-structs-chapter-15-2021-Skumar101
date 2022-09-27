import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
   Searches for words with the same hash code
   based on the filename.
*/
public class TwoWordsSameHashCode
{
   /**
      Makes a hash code to string map based on the words in the specified file
      @param filename the filename to read words from
      @return a hash map mapping hash values to words found in the filename
   */
   public static Map<Integer, HashSet<String>> generateHashMap(String filename)
   {
       Scanner reader = new Scanner(new File(filename));
       
   }

   /**
      Prints all the words with the same hash codes
      @param hashCodes the map to print from
   */
   public static void printSameCodes(Map<Integer, HashSet<String>> hashCodes)
   {
      

   }
}
