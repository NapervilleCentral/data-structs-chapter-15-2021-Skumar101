import java.util.*;
public class Grid
{
   private static final int SIZE = 10;
   int[][] pixels = new int[SIZE][SIZE];
   int r;
   int c;
   Stack<Integer> nums = new Stack<>();
   int count =1;
   /**
      Flood fill, starting with the given row and column.
   */
   public void floodfill(int row, int column)
   {
     pixels[r][c] = count;
     if(count<=SIZE*SIZE)
     {
         count++;
         if(pixels[row-1][column]==0)
         {
             pixels[row-1][column] = count;
             nums.add(pixels[row-1][column]);
             count++;
            }
            if(pixels[row][column+1]==0)
         {
             pixels[row][column+1] = count;
             nums.add(pixels[row][column+1]);
             count++;
            }
            if(pixels[row+1][column]==0)
         {
             pixels[row+1][column] = count;
             nums.add(pixels[row+1][column]);
             count++;
            }
            if(pixels[row][column-1]==0)
         {
             pixels[row][column-1] = count;
             nums.add(pixels[row][column-1]);
             count++;
            }
         for(int r = 0; r< SIZE; r++)
            {
                for(int c = 0; c<SIZE; c++)
                {
                    if(pixels[r][c]==nums.peek())
                        {floodfill(r, c);
                        break;}
                }
            }
        }
     
   }

   @Override
   public String toString()
   {
      String r = "";
      for (int i = 0; i < SIZE; i++)
      {
         for (int j = 0; j < SIZE; j++)
            r = r + String.format("%4d", pixels[i][j]);
         r = r + "\n";
      }
      return r;
   }
}
