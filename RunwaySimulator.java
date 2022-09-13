import java.util.*;
/**
   Class for simulating a runway.
*/
public class RunwaySimulator
{
   Queue<String> takeOff = new LinkedList<>();
   Queue<String> Land = new LinkedList<>();

   /**
      Constructor.
   */
   public RunwaySimulator()
   {
       
   }

   /**
      Add a flight symbol to the taking off queue.
      @param flightSymbol the flight symbol.
   */
   public void addTakeOff(String flightSymbol)
   {
      takeOff.add(flightSymbol);

   }

   /**
      Add a flight symbol to the landing queue.
      @param flightSymbol the flight symbol.
   */
   public void addLanding(String flightSymbol)
   {
      Land.add(flightSymbol);

   }

   /**
      Handle the next action.
   */
   public void handleNextAction()
   {
      if(Land.size()>0){
       while(Land.size()>0)
      {
          Land.remove();
        }
    }
    else
    {
       while(takeOff.size()>0)
       {
           Land.add(takeOff.remove());
        }
    }  
   }
   public String toString()
   {
       return "Take Off Queue: "+takeOff.toString()+"\n Landing Queue: "+Land.toString();
    }
}
