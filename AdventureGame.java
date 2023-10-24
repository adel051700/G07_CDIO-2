public class AdventureGame {

    public static void main(String[] args) {
        Player player1=new Player(1);
        Player Player2=new Player(2);
        boolean player1turn =true;
        Dice dice1=new Dice(6);
        Dice dice2=new Dice(6);
        
        int sum=dice1.rollDie() + dice2.rollDie();
        
        Tile[] tiles= Tile.getTilesFromFile();
        System.out.println(tiles[sum].getStory());
        player1.changeBalance(tiles[sum].getValue());
        System.out.println(player1.toString());

    }
    
}