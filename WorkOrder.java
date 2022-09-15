/**
   This class encapsulates a work order with a priority.
*/
public class WorkOrder implements Comparable
{
   private int priority;
   private String description;
   final int HASH_MULTIPLIER = 7;
   /**
      Constructs a work order with a given priority and description.
      @param aPriority the priority of this work order
      @param aDescription the description of this work order
   */
   public WorkOrder(int aPriority, String aDescription)
   {
      priority = aPriority;
      description = aDescription;
   }

   public String toString()
   {
      return "priority=" + priority + ", description=" + description;
   }

   public int compareTo(Object otherObject)
   {
      WorkOrder other = (WorkOrder) otherObject;
      if (priority < other.priority) { return -1; }
      else if (priority > other.priority) { return 1; }
      else { return 0; }
   }
   /**
    * @Override the Object hashCode method
    */
   public int hashCode()
   {
       //String adds the chars together and then * by prime # 31
       int h1 = description.hashCode();
       int h2 = new Integer(priority).hashCode();
       int ha = HASH_MULTIPLIER*(h1+h2);
       return ha;
       //return Object.hash(description, priority);
    }
}
