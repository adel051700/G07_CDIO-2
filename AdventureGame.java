import java.util.Scanner;
public class AdventureGame {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);  
        Player player1 = new Player(1);
        Player player2 = new Player(2);
        boolean player1turn = true;
        Dice dice1 = new Dice(6);
        Dice dice2 = new Dice(6);
        Tile[] tiles = Tile.getTilesFromFile();
        System.out.println("Welcome to the game! Press enter to start your journey!");
        s.nextLine();
        
        while (player1.getBalance() < 3000 && player2.getBalance() < 3000) {
            if (player1turn){
            System.out.println("It's player one's turn, press enter to roll the die!");
        } else {
            System.out.println("It's player two's turn, press enter to roll the die!");
        }
        
        s.nextLine();
            if (player1turn) {
                int sum = dice1.rollDie() + dice2.rollDie();
                    if(sum != 10){
                        player1turn = false;
                    }
                System.out.println(tiles[sum-2].getStory());
                player1.changeBalance(tiles[sum-2].getValue());
                System.out.println(player1.toString());
            } else if (!player1turn) {
                int sum = dice1.rollDie() + dice2.rollDie();
                    if(sum != 10){
                        player1turn = true;
                    }
                System.out.println(tiles[sum-2].getStory());
                player2.changeBalance(tiles[sum-2].getValue());
                System.out.println(player2.toString());
            }
        }
        if (player1.getBalance()>3000){
            System.out.println(player1.toString()+ " which mean they win the game, congrats!");
        } else if(player2.getBalance()>3000){
            System.out.println(player2.toString()+ " which mean they win the game, congrats!");
        }
        s.close();
    }

}