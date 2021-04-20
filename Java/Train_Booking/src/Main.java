import java.util.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TrainManagementSystem tms=new TrainManagementSystem();
		System.out.println("Enter the source");
		String src=sc.nextLine();
		System.out.println("Enter the destination");
		String dest=sc.nextLine();
		System.out.println("Enter the coach type");
		String ctype=sc.nextLine();
		if(ctype.toUpperCase().equals("AC1") || ctype.toUpperCase().equals("AC2") || ctype.toUpperCase().equals("AC3") || ctype.toUpperCase().equals("SEATER") || ctype.toUpperCase().equals("SLEEPER")){
		    ArrayList<Train> ar=new ArrayList<Train>();
		    ar=tms.viewTrain(ctype.toLowerCase(),src,dest);
		    if(ar.size()==0){
		        System.out.println("No trains found");
		    }
		    else{
		        for(Train t:ar){
		            System.out.println(t.getTrainNumber()+" "+t.getTrainName());
		        }
		    }
		}
		else{
		    System.out.println("Invalid Coach Type");
		}
		

		
	}
}