import java.util.Scanner;

class Main {
  static Album albumOne;
  static Album albumTwo;

  private static String convertToMin(Integer secs){
    Integer min = secs/60;
    Integer sec = secs-min*60;
    if(sec>=10) {
      return min.toString() + ":" + sec.toString();
    }
    else {
      return min.toString() + ":0" + sec.toString();
    }
  }
  public static void main(String[] args) {
    String w;
    System.out.println("Welcome to AlbumTime!");
    for (int k = 0; k < 2; k++) {
      System.out.println("\n\n\n\nEnter the name of the artist.");
      Scanner scan = new Scanner(System.in);
      String artist = scan.nextLine();
      System.out.println("\n\nAnd now, the album title.");
      String title = scan.nextLine();

      //Songs and their lengths
      System.out.println("\n\nHow many songs on the album? ");
      int songs = scan.nextInt();
      if (k == 0) {
        albumOne = new Album(artist, title, songs);
        for (int c = 0; c < songs; c++) {
          System.out.println("Length of song " + c + ": \n<Minutes: ");
          int minutes = scan.nextInt();
          w = scan.nextLine();
          System.out.println("\n<Seconds: ");
          int seconds = scan.nextInt();
          w = scan.nextLine();

          seconds += minutes * 60;
          albumOne.addLengths(seconds);
        }
        System.out.println(albumOne);
      }
      else {
        albumTwo = new Album(artist, title, songs);
        for (int c = 0; c < songs; c++) {
          System.out.println("Length of song " + c + ": \n<Minutes: ");
          int minutes = scan.nextInt();
          w = scan.nextLine();
          System.out.println("\n<Seconds: ");
          int seconds = scan.nextInt();
          w = scan.nextLine();

          seconds += minutes * 60;
          albumTwo.addLengths(seconds);
        }
        System.out.println(albumTwo + "\n\n\n");
        if(albumTwo.getMin() < albumOne.getMin()){
          System.out.println(albumTwo.getName() + ": " + albumTwo.getAlbums() + " has the shortest song, by a difference of " + convertToMin(albumOne.getMin() - albumTwo.getMin()));
        }
        else if(albumOne.getMin() < albumTwo.getMin()){
          System.out.println(albumOne.getName() + ": " + albumOne.getAlbums() + " has the shortest song, by a difference of " + convertToMin(albumTwo.getMin() - albumOne.getMin()));
        }

        if(albumTwo.getMax() > albumOne.getMin()){
          System.out.println(albumTwo.getName() + ": " + albumTwo.getAlbums() + " has the longest song, by a difference of " + convertToMin(albumTwo.getMax() - albumOne.getMax()));
        }
        else if(albumTwo.getMax() < albumOne.getMax()){
          System.out.println(albumOne.getName() + ": " + albumOne.getAlbums() + " has the longest song, by a difference of " + convertToMin(albumOne.getMax() - albumTwo.getMax()));
        }

        if(albumTwo.getTotal() > albumOne.getTotal()){
          System.out.println(albumTwo.getName() + ": " + albumTwo.getAlbums() + " has the longer album, by a difference of " + convertToMin(albumTwo.getTotal() - albumOne.getTotal()));
        }
        else if(albumTwo.getTotal() < albumOne.getTotal()){
          System.out.println(albumOne.getName() + ": " + albumOne.getAlbums() + " has the longer album, by a difference of " + convertToMin(albumOne.getTotal() - albumTwo.getTotal()));
        }

        if(albumTwo.getAvg() > albumOne.getAvg()){
          System.out.println(albumTwo.getName() + ": " + albumTwo.getAlbums() + " has the longer average, by a difference of " + convertToMin(albumTwo.getAvg() - albumOne.getAvg()));
        }
        else if(albumTwo.getTotal() < albumOne.getTotal()){
          System.out.println(albumOne.getName() + ": " + albumOne.getAlbums() + " has the longer average, by a difference of " + convertToMin(albumOne.getTotal() - albumTwo.getTotal()));
        }
        }
      }



      //begin by declaring your first album object here
      //TODO make array for songs minutes and seconds

      //ask how many songs are on the album next, then make a loop to get the inputs


    }
  }
