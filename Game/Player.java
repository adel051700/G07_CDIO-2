public class Player {
    private int playerNumber;
    private Bank account;
 
    public Player(int playerNumber) {
        this.playerNumber = playerNumber;
        this.account = new Bank();
    }
    
    public String toString(){
        return "Player " + this.playerNumber + " bankbalance: " + getBalance();
    }

    public int getBalance() {
        return this.account.getBalance();
    }

    public void changeBalance(int deltaBalance) {
        this.account.changeBalance(deltaBalance);
    }
        
    
}
