import java.util.*;
class Authority
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Inmate's name:");
        String f=sc.nextLine();
        System.out.println("Inmate's father's name:");
        String l=sc.nextLine();
        f=f.toLowerCase();
        f+=" ";
        l=l.toLowerCase();
        
        int x=f.length();
        int flag=0;
        for(int i=0;i<x;i++)
        {
            if (!((f.charAt(i)>='a' && f.charAt(i)<='z') || f.charAt(i)==' '))
            {
                System.out.print("Invalid name");
                flag=1;
                break;
            }
            
        }
        x=l.length();
        if(flag==0)
        {
            for(int i=0;i<x;i++)
            {
                if (!((l.charAt(i)>='a' && l.charAt(i)<='z') || l.charAt(i)==' '))
                {
                    System.out.print("Invalid name");
                    flag=1;
                    break;
                }
                
            }
        }
        if(flag==0)
        {
            String fn=f.concat(l);
            System.out.println(fn.toUpperCase());
        }
        
    }
}