import java.util.*;

/**
   This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
   /**
      Reverses the elements in a linked list
      @param strings the linked list to reverse
   */
   public static void reverse(LinkedList<String> strings)
   {
    String name;  
    int size = strings.size()-1;
    int i=strings.size()-1;
    //LinkedList<String> NewStrings = new LinkedList<>();
    while (i>=0) {
         name = strings.removeLast();
          strings.add(size -i,name);
          i--;
    }
    }
}
     /*for (int i = 0; i<strings.size(); i++) {
          name = iterator.next();
          iterator.remove();
          strings.addLast(name);
        }
        */