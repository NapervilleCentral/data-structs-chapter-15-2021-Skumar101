import java.util.LinkedList;

/**
   A test class for the downsize method.
*/
public class DownsizeTester
{
   public static void main(String[] args)
   {
      LinkedList<String> employeeNames = new LinkedList<>();
      employeeNames.addLast("Amelia");
      employeeNames.addLast("Charlotte");
      employeeNames.addLast("Emma");
      employeeNames.addLast("Harry");
      employeeNames.addLast("Oliver");
      employeeNames.addLast("Romeo");
      employeeNames.addLast("Tom");


      Business.downsize(employeeNames, 2);
    
      System.out.println(employeeNames);
      System.out.println("Expected: [Amelia, Emma, Oliver,Tom]");
   }
}
