//Make this class inherit the Employee class
package Employee;

public class TemporaryEmployee extends Employee{
	
	private int  hoursWorked;
	private int hourlyWages;
	
	public void calculateSalary(){
        salary=hoursWorked*hourlyWages;
    }
	

    public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.hoursWorked=hoursWorked;
        this.hourlyWages=hourlyWages;
	}


	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHourlyWages() {
		return hourlyWages;
	}
	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	
	//1. Write a public 4 argument constructor with arguments – employeeId, employeeName, hoursWorked and hourlyWages.  
	
	
	
	
	//2. Implement the  - public void calculateSalary() - method  
	
	
	
}
