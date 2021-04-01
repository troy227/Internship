public class Account {
    private int accountId;
    private String accountType;
    private int balance;
    public int getAccountId()
    {
        return accountId;
    }
    public void setAccountId(int ai)
    {
        accountId=ai;
    }
    public String getAccountType()
    {
        return accountType;
    }
    public void setAccountType(String at)
    {
        accountType=at;
    }
    public int getBalance()
    {
        return balance;
    }
    public void setBalance(int b)
    {
        balance=b;
    }
    /*public Account(int accountId,String accountType,int balance)
    {
        this.accountId=accountId;
        this.accountType=accountType;
        this.balance=balance;
    }
    */
    public boolean withdraw(int n)
    {
        if(balance>=n)
        {
            balance-=n;
            System.out.println("Balance amount after withdraw: "+String.valueOf(balance));
            return true;
        }
        else
        {
            System.out.println("Sorry!!! No enough balance");
            return false;
        }
    }
}

