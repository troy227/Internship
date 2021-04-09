package Auditing;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Main {
	
	private static Map <String,Double> employeeMap;

	public Map<String, Double> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(Map<String, Double> employeeMap) {
		this.employeeMap = employeeMap;
	}
	
	public void addEmployeeDetails(String employeeName, double salary)
	{
		getEmployeeMap().put(employeeName, salary);
	}
	
	
	
	public static EmployeeAudit findEmployee()
	{
       List<String> name=null;
        Main m=new Main();

        EmployeeAudit ea=(salary) -> {
            //List<String> names;
            List<String> names=new ArrayList<String>();
            //names=m.getEmployeeMap().entrySet().stream().filter(value -> value.getValue().doubleValue()<=salary).map(Map.Entry::getKey).collect(Collectors.toList());
            for (Map.Entry<String,Double> entry : m.getEmployeeMap().entrySet()){
                if(entry.getValue()<=salary){
                    names.add(entry.getKey());
                }
            }
            
            Collections.sort(names);
            return names;
        };
        
        return ea;

        
	}
	
	public static void main(String[] args)
	{
		Main m=new Main();
        HashMap<String,Double> hs=new HashMap<>();
        m.setEmployeeMap(hs);
		Scanner sc=new Scanner(System.in);
		int choice;
        
        while(true){
            System.out.println("1. Add Employee Details");
            System.out.println("2. Find Employee Details");
            System.out.println("3. Exit");
            System.out.println("Enter the choice");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                System.out.println("Enter the Employee Name");
                String name=sc.nextLine();
                System.out.println("Enter the Employee Salary");
                double salary=sc.nextDouble();
                
                m.addEmployeeDetails(name,salary);
                sc.nextLine();
                break;

                case 2:
                System.out.println("Enter the salary to be searched");
                int searchSalary=sc.nextInt();
                
                EmployeeAudit a=findEmployee();
                List<String> names=a.fetchEmployeeDetails(searchSalary);
                if(names.isEmpty()){
                    System.out.println("No Employee Found");
                }
                else{
                    
                    for(String s:names){
                        System.out.println(s);
                    }
                }
                
                

                break;

                case 3:
                System.out.println("Let's complete the session");
                break;

                default:
                break;
            }
            if(choice==3){
                break;
            }
        }

		
        
	}

}
