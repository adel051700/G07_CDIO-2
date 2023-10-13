import java.io.File;
class getTilesFromFile 
{
  public static void main(String[] args) 
  {
    String language = "english";
    try
    {
    var fileToRead = new File(language + ".txt");
    var Scanner = new java.util.Scanner(fileToRead);

      while (Scanner.hasNextLine())
    {
      String tile = Scanner.nextLine();
      String[] tileValues = tile.split(":");
      String name = tileValues[0];
      String story = tileValues[1];
      int value = Integer.parseInt(tileValues[2]);
    }

    } 
    catch(Exception e)
    {
      System.out.println(e + " Error bitch");
    }

    
    
    

  }
}