
public class CDCollectionTest
{
  public static void main(String[] args)
  {
    //make CDCollection
    CDCollectionLL db = new CDCollectionLL();


    db.addCD("Summer Teeth","Wilco",13.00,17,5);
    db.addCD("Sea of Noise","St. Paul and the Broken Bones", 10.99,20,5);
    db.addCD("Witness", "Benjamin Booker",11.49, 12,5);
    db.addCD("Strange Desire","Bleachers", 9.00,16,4);
    db.addCD("Feel your Feelings Fool!","The Regretts", 7.99,15,5);
    db.addCD("The Ride","Catfish and the Bottlemen", 9.99,11,4.5);
    db.addCD("Everybody Wants","The Struts", 11.79,13,5);
    db.addCD("Comming Home","Leon Bridges", 12.49,10,5);
    db.addCD("If'n","fIREHOSE", 10.09,14,5);
    db.addCD("Let it Be","The Replacements", 8.99,16,5);
    db.addCD("A Positive Rage","The Hold Steady", 10.49,16,4.5);
    db.addCD("Let the Record Play","Moon Taxi", 1.99,10,2.5);
    db.addCD("Rainbow","Kesha", 7.19,10,1.5);
    db.addCD("Songs about Jane","Maroon 5", 5.99,10,.5);
    db.addCD("Nervous System","Julia Michaels", 6.99,7,1.5);
    System.out.println(db);

    //displays the entire list of CD's "Artist"--"CD"--"Number of Tracks"




  }
}

