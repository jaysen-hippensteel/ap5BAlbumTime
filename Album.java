import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;//import Collections

public class Album
{
  
  //instance variables: remember to make them private and don't give them values yet (do that in the constructor)
  private String name;
  private String albums;
  private Integer numSongs;
  private Integer minlength;
  private Integer maxlength;
  private Integer avgLength;
  private Integer totalLength;
  private ArrayList<Integer> songData = new ArrayList<Integer>(); // Create an ArrayList object
  //constructor: accept the artist name and album title as parameters, set all other instance variables to default values
  public Album(String nm, String alb, Integer nmsngs){
    name = nm;
    albums = alb;
    numSongs = nmsngs;
  }

  public void addLengths(Integer secs){
    songData.add(secs);
  }

  public String toString(){
    ArrayList<Integer> findMin = songData;
    Collections.sort(findMin);
    minlength = findMin.get(0);
    //TODO get max, average, and totalLength to return, and compare

    String returner = "Artist: " + name + "\nAlbum: " + albums + "\nSongs: " + numSongs.toString() + "\nMin Length: " + minlength.toString() + "\nMax Length" + maxlength.toString() + "\nAverage Length: " + avgLength.toString() + "\nTotal Length: " + totalLength.toString();
    return returner;
  }
  //mutator method: track instance variables

  //toString method: return album summary

  //accessor methods: return the instance variables

}