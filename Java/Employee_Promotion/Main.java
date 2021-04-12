package Employee_Promotion;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employees");
        int no=sc.nextInt();
        sc.nextLine();
        List<Employee> empList=new ArrayList<Employee>();
        System.out.println("Enter the employee details");
        String temp;
        for(int i=0;i<no;i++){
            temp=sc.nextLine();
            String[] temparr=temp.split(":");
            Employee obj=new Employee(temparr[0],temparr[1],Double.parseDouble(temparr[2]));
            empList.add(obj);

        }
        System.out.println("Enter the number of times salary limit to be searched");
        int limit=sc.nextInt();
        List<Management> ms=new ArrayList<Management>();
        for(int i=0;i<limit;i++){
            

            System.out.println("Enter the salary limit to be searched");
            double sal=sc.nextDouble();
            Management t1=new Management(sal,empList);
            t1.start();
            
            try {
                t1.join();
            } catch (InterruptedException e) {
                
                
            }
            ms.add(t1);
            
            
        }
        for(Management i:ms){
            System.out.println(i.getSalaryLimit()+":"+i.getCount());
        }
    }
}
