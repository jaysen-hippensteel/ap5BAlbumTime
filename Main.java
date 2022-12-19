import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    for (int k=0;k<2;k++){
      System.out.println("Welcome to AlbumTime! Enter the name of the artist.");
      Scanner scan = new Scanner(System.in);
      String artist = scan.nextLine();
      System.out.println("\n\nAnd now, the album title.");
      String title = scan.nextLine();
      System.out.println("\n\nHow many songs on the album? ");
      int songs = scan.nextInt();
      for (int c=0; c<songs; c++){
        System.out.println("Length of song " + c + ": \n<Minutes: ");
        int minutes = scan.nextInt();
        System.out.println("\n<Seconds: ");
        int seconds = scan.nextInt();

      }

    //begin by declaring your first album object here
    //TODO

    //ask how many songs are on the album next, then make a loop to get the inputs


  }
}