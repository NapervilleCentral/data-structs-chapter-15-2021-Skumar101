//********************************************************************
//  CD.java       Author: Lewis/Loftus/Cocking
//
//  Represents a compact disc.
//********************************************************************

import java.text.NumberFormat;

public class CD implements Comparable
{
   private String title, artist;
   private double cost;
   private int tracks;
   private double rating;
   private String genre;

   //-----------------------------------------------------------------
   //  Creates a new CD with the specified information.
   //-----------------------------------------------------------------
   public CD (String name, String singer, double price, int numTracks)
   {
      title = name;
      artist = singer;
      cost = price;
      tracks = numTracks;
      rating = 0;
   }
   //-----------------------------------------------------------------
      //  Creates a new CD with the specified information.
      //-----------------------------------------------------------------
      public CD (String name, String singer, double price, int numTracks, double rate)
      {
         title = name;
         artist = singer;
         cost = price;
         tracks = numTracks;
         rating = rate;
   }
     
   public double getRating()
   {
       return rating;
    }
   
   public int compareTo(Object other)
     {
         return (int)(this.rating-((CD)other).getRating());
      }
   //-----------------------------------------------------------------
   //  Returns a description of this CD.
   //-----------------------------------------------------------------
   public String toString()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();

      String description;

      description = "Cost: "+fmt.format(cost) + "\t" +"Tracks: "+ tracks + "\t";
      description += "Title: "+title + "\t" +"Artist: "+ artist+ "\t"+ "Rating: "+rating;

      return description;
   }
}
