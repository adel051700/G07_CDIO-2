import java.io.File;
class getTilesFromFile 
{
  public static void main(String[] args) 
  {
    int numberOfTiles = 11;
    Tile[]tileArr = new Tile[numberOfTiles];
    String language = "english";
    try
    {
    var fileToRead = new File(language + ".csv");
    var Scanner = new java.util.Scanner(fileToRead);
    int i = 0;
      while (Scanner.hasNextLine())
    {
      
      String tile = Scanner.nextLine();
      String[] tileValues = tile.split(";");
      String name = tileValues[0];
      String story = tileValues[1];
      int value = Integer.parseInt(tileValues[2]);
      tileArr[i] = new Tile(name,story,value);
      i++;
    }
    Scanner.close();
    } 
    catch(Exception e)
    {
      System.out.println(e + " Error");
    }

    
    
    

  }
}