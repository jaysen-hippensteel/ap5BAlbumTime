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

    Collections.sort(songData);
    minlength = songData.get(0);
    Integer minLengthMin = minlength/60;
    Integer minLengthSec = minlength - minLengthMin*60;
    if (minLengthSec < 10){
      minLengthString = minLengthMin.toString() + ":0" + minLengthSec.toString();
    }
    else {
      minLengthString = minLengthMin.toString() + ":" + minLengthSec.toString();
    }

    maxlength = songData.get(songData.size()-1);
    Integer maxLengthMin = maxlength/60;
    Integer maxLengthSec = maxlength - maxLengthMin*60;
    if (maxLengthSec < 10){
      maxLengthString = maxLengthMin.toString() + ":0" + maxLengthSec.toString();
    }
    else {
      maxLengthString = maxLengthMin.toString() + ":" + maxLengthSec.toString();
    }

    totalLength = 0;

    for (int k=0; k<songData.size();k++){
      totalLength = totalLength + songData.get(k);
    }

    avgLength = totalLength/songData.size();
    Integer avgLengthMin = avgLength/60;
    Integer avgLengthSec = avgLength - avgLengthMin*60;
    if (avgLengthSec < 10){
      avgLengthString = avgLengthMin.toString() + ":0" + avgLengthSec.toString();
    }
    else {
      avgLengthString = avgLengthMin.toString() + ":" + avgLengthSec.toString();
    }

    Integer totalLengthMin = totalLength/60;
    Integer totalLengthSec = totalLength - totalLengthMin*60;
    if (totalLengthSec < 10){
      totalLengthString = totalLengthMin.toString() + ":0" + totalLengthSec.toString();
    }
    else {
      totalLengthString = totalLengthMin.toString() + ":" + totalLengthSec.toString();
    }
  }

  public String toString(){

    String returner = "Artist: " + name + "\nAlbum: " + albums + "\nSongs: " + numSongs.toString() + "\nMin Length: " + minLengthString + "\nMax Length" + maxLengthString + "\nAverage Length: " + avgLengthString + "\nTotal Length: " + totalLengthString;
    return returner;
  }
  public String getName(){
    return name;
  }
  public String getAlbums(){
    return albums;
  }
  public Integer getMin(){
    return minlength;
  }
  public Integer getMax(){
    return maxlength;
  }
  public Integer getAvg(){
    return avgLength;
  }
  public Integer getTotal(){
    return totalLength;
  }
//change these to integer
  public Integer getNumMin(){
    return minlength;
  }
  public Integer getNumMax(){
    return maxlength;
  }
  public Integer getNumAvg(){
    return avgLength;
  }
  public Integer getNumTotal(){
    return totalLength;
  }
}