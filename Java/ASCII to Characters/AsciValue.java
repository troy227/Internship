import java.util.*;
public class AsciValue
{
    public static void main(String[] args)
    {
        System.out.println("Enter the digits:");
        Scanner sc=new Scanner(System.in);
        int a;
        for(int i=0;i<4;i++)
        {
            a=sc.nextInt();
            System.out.println(a+"-"+(char)a);
        }
    }
}