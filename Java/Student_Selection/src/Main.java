import java.util.*;
public class Main {
	public static void main(String[] args) {
	    PlayerSelectionSystem pss=new PlayerSelectionSystem();
		Scanner sc=new Scanner(System.in);
		double height,weight;
		System.out.println("Enter the minimum height");
		height=sc.nextDouble();
		System.out.println("Enter the maximum weight");
		weight=sc.nextDouble();
		List<String> ls=new ArrayList<String>();
		ls=pss.playersBasedOnHeightWeight(height,weight);
		if(ls.size()==0){
		    System.out.println("No players are with minimum height of "+height+" and maximum weight of "+weight);
		}
		else{
		    for(String i:ls){
		    System.out.println(i);
		}
		}
		

		
	}
}