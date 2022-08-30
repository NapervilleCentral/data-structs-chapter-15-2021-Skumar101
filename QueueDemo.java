import java.util.LinkedList;
import java.util.Queue;

/**
   This program simulates a print queue. Note that documents are printed
   in the same order as they are submitted.
*/
public class QueueDemo
{
   public static void main(String[] args)
   {
       //create Queue of Strings = new LinkedList<>
      Queue<String> jobs = new LinkedList<>();
      //add several "jobs"
      //print jobs as you remove from the list
        jobs.add("Kevin: Take my mom to the doc #1");
        jobs.add("Ben  : Do my math homework    #2");
        jobs.add("Alex : Go to get Swelled!!!   #3");
        jobs.add("Ted  : Wast my time           #4");
        jobs.add("Tammy: Go get yelled at by old people #5");
        jobs.add("Mr. Kim: Don't forget to NOT sneeze on Declin #6");
        
        System.out.println(jobs.peek());
      //display the rest of the Queue (remove as you print
      while (jobs.size() > 0)
      {
        System.out.println("Printing "+jobs.remove());
      }
   }
}
