import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		Bazaar bz=new Bazaar();
        HashMap<Integer,String> hs=new HashMap<>();
        //bz.setPolicyMap(hs);
		Scanner sc =new Scanner(System.in);
        
		System.out.println("Enter the no of Policy names you want to store");
        int noOfPolicy=sc.nextInt();
        int policyId;
        String policyName; 
        for(int i=0;i<noOfPolicy;i++){
            System.out.println("Enter the Policy ID");
            policyId=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Policy Name");
            policyName=sc.nextLine();
            
            hs.put(policyId,policyName);
            System.out.println("HASHMAP IN UI-"+hs);
            
            
        }
        System.out.print("");
        
        bz.setPolicyMap(hs);
        ArrayList<Integer> sortedKeys =
                    new ArrayList<Integer>(bz.getPolicyMap().keySet());
		Collections.sort(sortedKeys);
        for(int x:sortedKeys){
            System.out.println(x+" "+bz.getPolicyMap().get(x));
        }
        System.out.println("Enter the policy type to be searched");
        String pType=sc.nextLine();
        List<Integer> l=new ArrayList<Integer>();
        l=bz.searchBasedOnPolicyType(pType);
        for(int i:l){
            System.out.println(i);
        }

	}

}