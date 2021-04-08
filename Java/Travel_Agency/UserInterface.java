package Travel_Agency;
import java.util.*;
public class UserInterface {
    public static CommissionInfo generateCommissionObtained(){
        CommissionInfo ci=(ticket)->{
            String cType=ticket.getClassType();
            
            if(cType.equals("3A") || cType.equals("2A") || cType.equals("1A") || cType.equals("1a") || cType.equals("2a") || cType.equals("3a")){
                return 100.0;
            }
            else{
                return 60.0;
            }
           
        };
        return ci;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<Ticket> tk=new ArrayList<Ticket>();
        System.out.println("Enter the no of passengers");
        int noOfPassengers=sc.nextInt();
        for(int i=1;i<=noOfPassengers;i++){
            System.out.println("Details of Passenger "+i+":");
            System.out.println("Enter the pnr no:");
            long pnr=sc.nextLong();
            sc.nextLine();
            System.out.println("Enter passenger name:");
            String name=sc.nextLine();
            System.out.println("Enter seat no:");
            int seat=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter class type:");
            String ctype=sc.nextLine();
            System.out.println("Enter ticket fare:");
            double fare=sc.nextDouble();
            sc.nextLine();
            tk.add(new Ticket(pnr,name,seat,ctype,fare));
            
        }
        CommissionInfo c=generateCommissionObtained();
        double totalCom=0.00;
        for(Ticket t:tk){
            totalCom+=c.calculateCommissionAmount(t);
        }
        System.out.println("Commission Obtained");
        System.out.println("Commission obtained per each person: Rs."+String.format("%.2f",totalCom));
        
    }
}
