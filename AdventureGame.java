public class AdventureGame {

    public static void main(String[] args) {
        Player player1 = new Player(1);
        Player Player2 = new Player(2);
        boolean player1turn = true;
        Dice dice1 = new Dice(6);
        Dice dice2 = new Dice(6);

        System.out.println("Welcome to the game! Player 1, press enter to start your journey!");

        while (player1.getBalance() < 3000 && player2.getBalance() < 3000) {
            if (player1turn == true) {
                int sum = dice1.rollDie() + dice2.rollDie();
                Tile[] tiles = Tile.getTilesFromFile();
                System.out.println(tiles[sum].getStory());
                player1.changeBalance(tiles[sum].getValue());
                System.out.println(player1.toString());
            } else if (player1turn == false) {
                int sum = dice1.rollDie() + dice2.rollDie();
                Tile[] tiles = Tile.getTilesFromFile();
                System.out.println(tiles[sum].getStory());
                player2.changeBalance(tiles[sum].getValue());
                System.out.println(player2.toString());
            }
        }
    }

}