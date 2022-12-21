import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Album albumOne;
    Album albumTwo;
    String w;
    System.out.println("Welcome to AlbumTime!");
    for (int k = 0; k < 2; k++) {
      System.out.println("Enter the name of the artist.");
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
        }
      }



      //begin by declaring your first album object here
      //TODO make array for songs minutes and seconds

      //ask how many songs are on the album next, then make a loop to get the inputs


    }
  }
}