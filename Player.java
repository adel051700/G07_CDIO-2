public class Player {
    private int playerNumber;
    public int getBalance();
    public int changeBalance();

    public Player(int playerNumber) {
        this.playerNumber = playerNumber;
    }
    
    public String toString(){
        return "Player " + this.playerNumber + " bankbalance: " + getBalance();
    }
}
