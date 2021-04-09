package Employee_Loan_Eligibility;

import java.util.stream.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeUtility {

	public Employee[] getEmployeeDetails(String[] details) {

        Employee[] employeeDetails=new Employee[details.length];
        for(int i=0;i<details.length;i++){
            String[] temp=details[i].split(";");
            Employee tempObj=new Employee();
            tempObj.setEmpId(temp[0]);
            tempObj.setEmpName(temp[1]);
            tempObj.setSalary(Double.parseDouble(temp[2]));
            employeeDetails[i]=tempObj;
        }
        return employeeDetails;


	}

	public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {
        Stream<Employee> employeeStream=Arrays.stream(empDetails);
        return employeeStream;
		



	}

	public String[] shortlistedEmployee(Stream<Employee> empStream,double minSalary) {
        
        List<Employee> shortlist=empStream.collect(Collectors.toList());
        
        //String[] emp=shortlist.stream().filter(e->e.getSalary()<=minSalary).flatMap(n->Stream.of(n.getEmpId(),n.getEmpName(),n.getSalary())).toArray(String[]::new);
        List<Object> ls=shortlist.stream().filter(e->e.getSalary()>=minSalary).flatMap(n->Stream.of(n.getEmpId(),n.getEmpName(),n.getSalary())).collect(Collectors.toList());
	System.out.println(ls);
        String[] emp=new String[ls.size()/3];
        int index=0;
        for(int i=0;i<=ls.size()-3;i+=3){
                String temp="";
                temp+=ls.get(i)+" "+ls.get(i+1)+" "+ls.get(i+2);
                emp[index]=temp;
                index+=1;
        }
        Arrays.sort(emp);
        return emp;
        





	}

}
