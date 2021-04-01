import java.util.*;
public class AccountDetails {
    public static void main(String[] args)
    {
        new AccountDetails().getAccountDetails();
        new AccountDetails().getWithdrawAmount();
    }
    public Account getAccountDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter account id:");
        int aid=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account type:");
        String atype=sc.nextLine();
        int balance; 
        while(true){
            System.out.println("Enter balance:");
            balance=sc.nextInt();
            if(balance<=0)
            {
                System.out.println("Balance should be positive");
                continue;
            }
            else{
                break;
            }
        }
        Account a=new Account();
        a.setAccountId(aid);
        a.setAccountType(atype);
        a.setBalance(balance);
        return a;
        

        
    }
    public int getWithdrawAmount()
    {
        Scanner sc=new Scanner(System.in);
        int aw;
        while(true){
            System.out.println("Enter amount to be withdrawn:");
            aw=sc.nextInt();
            if(aw<=0)
            {
                System.out.println("Amount should be positive");
                continue;
            }
            else{
                break;
            }
        }
        return aw;
    }
}
