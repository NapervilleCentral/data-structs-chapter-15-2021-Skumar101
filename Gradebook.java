import java.util.*;
/**
   A program to add, remove, modify or print
   student names and grades.
*/
public class Gradebook
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      boolean done = false;
      Map <String, Double> Gradebook = new HashMap<>();
      Set <String> keys = new HashSet<>();
      
      while(!done)
      {
         System.out.println("A)dd R)emove M)odify P)rint Q)uit");
         String input = in.next().toUpperCase();
         if (input.equals("Q"))
         {
            done = true;
         }
         else if (input.equals("A"))
         {
             System.out.println("Input the student name: ");
             String name = in.next();
             System.out.println("Input the student grade: ");
             Double grade = in.nextDouble();
             Gradebook.put(name, grade);
         }
         else if (input.equals("R"))
         {
            System.out.println("Enter the student name for which you want to remove: ");
            String key = in.next();
            Gradebook.remove(key);
         }
         else if (input.equals("M"))
         {
            System.out.println("Enter the student name for which you want to modify: ");
            String Key = in.next();
            System.out.println("Enter the new grade: ");
            double nuevo = in.nextDouble();
            Gradebook.put(Key, nuevo);
         }
         else if (input.equalsIgnoreCase("P"))
         {
             keys = Gradebook.keySet();
             for(String key: keys)
             {
                 System.out.println(key+"'s GPA: "+Gradebook.get(key));
                }
             
         }
         else
         {
            done = true;
         }
      }
   }
}
