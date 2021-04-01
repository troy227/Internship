import java.util.Scanner;
public class Placement
{
    public static void main(String[] args)
    {
        int highest=-1;
        Scanner sc=new Scanner(System.in);
        int cse,me,ece;
        System.out.println("Enter the no of students placed in CSE:");
        cse=sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        ece=sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        me=sc.nextInt();
        
        if(cse<0 || me<0 || ece<0)
        {
            System.out.println("Input is Invalid");
        }
        else if(cse==me && me==ece)
        {
            System.out.println("None of the department has got the highest placement");
        }
        else
        {
            
            if(cse>me){
                highest=cse;
            }
            else
            {
                highest=me;
            }
            if(highest<ece)
            {
                highest=ece;
            }
        
            System.out.println("Highest placement");
            if(highest==cse)
            {
                System.out.println("CSE");
            }
            if(highest==ece)
            {
                System.out.println("ECE");
            }
            if(highest==me)
            {
                System.out.println("MECH");
            }
        }
    }
}