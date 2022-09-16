//********************************************************************
//  CDCollection.java       Author: Lewis/Loftus/Cocking
//
//  Represents a collection of compact discs.
//********************************************************************

import java.text.NumberFormat;
import java.util.*;
public class CDCollectionLL
{
   //private collection;// make LL
   private int count;
   private double totalCost;
   private LinkedList<CD> Collection = new LinkedList<>();
   private ListIterator<CD> iterator = Collection.listIterator();
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
    if(Collection.size()==0)
    {
        Collection.add(lol);
    }
    else
    {
        for(int i =0; i<Collection.size(); i++)
        {
            if(lol.compareTo(Collection.get(i))>=0)
            {
                CD first = Collection.get(i);
                Collection.add(i,lol);
                int size = Collection.size();
                for(int j = i+1; j<size; j++)
                {
                    if((j+1)==Collection.size())
                    {
                        Collection.addLast(Collection.remove(j));
                    }
                    else
                        {Collection.add(j+1, Collection.remove(j));}
                }
                Collection.add(i+1, first);
                break;
            }
        }
        if(!Collection.contains(lol))
        {
            Collection.addLast(lol);
        }
    }
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
        for(CD SeeDee:Collection)
        {
         report += SeeDee.toString() + "\n";
        }

      return report;
   }


}







