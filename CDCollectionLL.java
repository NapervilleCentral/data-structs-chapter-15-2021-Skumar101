//********************************************************************
//  CDCollection.java       Author: Lewis/Loftus/Cocking
//
//  Represents a collection of compact discs.
//********************************************************************

import java.text.NumberFormat;
import java.util.*;
import java.util.PriorityQueue;
public class CDCollectionLL
{
   //private collection;// make LL
   private int count;
   private double totalCost;
   private LinkedList<CD> Collection = new LinkedList<>();
   private ListIterator<CD> iterator = Collection.listIterator();
   PriorityQueue <CD> q = new PriorityQueue<>();
   /**
   *  Creates an initially empty collection.
   */
   
   public CDCollectionLL ()
   {

      count = 0;
      totalCost = 0.0;
   }

   /**
   *  Adds a CD to the collection, keeping list in order according to
         rating.
   *  @param
   */
   public void addCD (String title, String artist, double cost,
                      int tracks, double rate)
   {
    CD lol = new CD(title, artist, cost, tracks, rate);   
    q.add(lol);
    if(Collection.size()!=0)
    {
    q.addAll(Collection);
    Collection.clear();
    int size = q.size();
    for(int i = 0; i<size; i++)
    {
        Collection.addLast(q.remove());
    }
}
    else
        {Collection.add(q.remove());}
    count++;
    totalCost+=cost;
    
   }

   /**
   *  Returns a report describing the CD collection.
   */
   public String toString()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      String report = "******************************************\n";
      report += "My CD Collection\n\n";

      report += "Number of CDs: " + count + "\n";
      report += "Total cost: " + fmt.format(totalCost) + "\n";
      report += "Average cost: " + fmt.format(totalCost/count);

      report += "\n\nCD List:\n\n";

      //loop thru collection and display all the CD
        for(int x = 0; x<Collection.size(); x++)
        {
         report += Collection.get(x).toString() + "\n";
        }
      return report;
   }


}







