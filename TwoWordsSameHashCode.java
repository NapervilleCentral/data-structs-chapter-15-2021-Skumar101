import java.io.*;
import java.util.*;

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
       File fl = new File(filename);
       Scanner reader = new Scanner(System.in);
       try {reader = new Scanner(fl);}
       catch (IOException e){
        }
       Map<Integer, HashSet<String>> map = new HashMap<>();
       ArrayList<String> values = new ArrayList<>();
       ArrayList<Integer> keys = new ArrayList<>();
       while(reader.hasNext())
       {
           String word = reader.next();
           values.add(word);
           keys.add(word.hashCode());
                   }
       //System.out.println(values);
       //System.out.println(keys);
       for(int i = 0; i<keys.size()-1; i++)
       {
           for(int j = i+1; j<keys.size(); j++)
           {
               HashSet<String> hset = new HashSet<>();
               if(keys.get(i).equals(keys.get(j)))
               {
                   hset.add(values.get(i)); hset.add(values.get(j));
                   map.put(keys.get(i), hset);
                }
            }
        }
        return map;
   }

   /**
      Prints all the words with the same hash codes
      @param hashCodes the map to print from
   */
   public static void printSameCodes(Map<Integer, HashSet<String>> hashCodes)
   {
      for(Map.Entry<Integer,HashSet<String>> entry : hashCodes.entrySet())
      {
          System.out.println(entry.getKey()+": "+entry.getValue());
        }
        }
    }
