import java.io.File;
class getTilesFromFile {
  public static void main(String[] args) {
    String language = "english";
    try
    {
    var fileToRead = new File(language + ".txt");
    var Scanner = new java.util.Scanner(fileToRead);

      while (Scanner.hasNextLine())
    {
      String tile = Scanner.nextLine();
      System.out.println(tile);
    }

    } catch(Exception e)
    {
      System.out.println(e + "Error bitch");
    }

    
    
    

  }
}