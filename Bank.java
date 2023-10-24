public class Bank{

private int balance = 1000;

public void changeBalance(int deltaBalance)
{
    this.balance += deltaBalance;

}

public int getBalance()
{
    return this.balance;
}

public Bank() 
{

}    
    
}

