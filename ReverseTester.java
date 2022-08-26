import java.util.LinkedList;
/**
 * Write a description of class ReverseTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReverseTester
{
   public static void main()
   {
       LinkedList<String> employeeNames = new LinkedList<>();
      employeeNames.addLast("Miles");
      employeeNames.addLast("Thomas");
      employeeNames.addLast("Romeo");
      employeeNames.addLast("Tom");

      ListUtil.reverse(employeeNames);
    
      System.out.println(employeeNames);
      System.out.println("Expected: [Tom, Romeo, Thomas, Miles]");
   }
    }
