import java.util.*;
/**
 * Write a description of class removePairs here.
 *
 * @author (Jessica and Sahil)
 * @version (8/31)
 */
public class removePairs
{
    public static void main(String args[]) {
        int count = 0;
        Queue <Integer> removeFirst = new LinkedList<>();
        Queue <Integer> removeSecond = new LinkedList<>();
        Scanner in = new Scanner(System.in);
      System.out.println("Enter the amount of elements in the queue.");
      int num = in.nextInt();
      System.out.println("Enter the order of the first queue.");
      for (int i = 0; i<num; i++) {
          int orderFirst = in.nextInt();
          removeFirst.add(orderFirst);
        }
       
      System.out.println("Enter the order of the second queue.");
      for (int i = 0; i<num; i++) {
          int orderSecond = in.nextInt();
          removeSecond.add(orderSecond);
        }
       
      while (num!=0) {
          if (removeFirst.peek() == removeSecond.peek()) {
              removeFirst.remove();
              removeSecond.remove();
              num--;
          }
          else {
              removeFirst.add(removeFirst.remove());
          }
          count++;
      }
      System.out.println(count);
      }
    }