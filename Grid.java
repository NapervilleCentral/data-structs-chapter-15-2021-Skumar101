import java.util.*;
public class Grid
{
   private static final int SIZE = 10;
   int[][] pixels = new int[SIZE][SIZE];
   int r;
   int c;
   Stack<Integer> nums = new Stack<>();
   Stack<Integer> rcol = new Stack<>();
   int count =1;
   /**
      Flood fill, starting with the given row and column.
   */
   public void floodfill(int row, int column)
   {
       for(int i =100; i>=1; i--)
       {
           nums.add(i);
        }
       
        pixels[row][column]=nums.pop();
     while(count<(SIZE*SIZE))
     {
         if(row!=0)
         {
         if(pixels[row-1][column]==0)
         {
             pixels[row-1][column] = nums.pop();
             rcol.add(pixels[row-1][column]);
             count++;
            }
        }
        if(column!=SIZE-1)
        {
        if(pixels[row][column+1]==0)
         {
             pixels[row][column+1] = nums.pop();
             rcol.add(pixels[row][column+1]);
             count++;
            }
        }
        if(row!=SIZE-1)
        {    
        if(pixels[row+1][column]==0)
         {
             pixels[row+1][column] = nums.pop();
             rcol.add(pixels[row+1][column]);
             count++;
            }
        }
         if(column!=0)
         {   
            if(pixels[row][column-1]==0)
         {
             pixels[row][column-1] = nums.pop();
             rcol.add(pixels[row][column-1]);
             count++;
            }
        }
        int lastnum = rcol.pop();
        for(int r = 0; r<SIZE; r++)
        {
            for(int c = 0; c<SIZE; c++)
            {
                if(pixels[r][c] == lastnum)
                {
                    row = r;
                    column = c;
                }
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
