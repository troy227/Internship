package Stu.Bank;

public class SavingsAccount extends Account{
    private double minimumBalance;
    public SavingsAccount(int accountNumber, Customer customerObj, int balance, double minimumBalance){
        
        this.accountNumber=accountNumber;
        this.customerObj=customerObj;
        this.balance=balance;
        this.minimumBalance=minimumBalance;
    }

    
    public boolean withdraw(double amount){
        if(balance>minimumBalance){
            balance-=amount;
            return true;
        }
        return false;
    }
    
    public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
    

    
}

    