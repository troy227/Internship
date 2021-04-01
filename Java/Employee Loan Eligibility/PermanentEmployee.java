package Employee;
//Make this class inherit the Employee class

public class PermanentEmployee extends Employee
{
    private double basicPay;
    
    public PermanentEmployee(int employeeId, String employeeName, double basicPay){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.basicPay=basicPay;
	}

	public void calculateSalary(){
		salary=basicPay-(basicPay*0.12);
	}
	
    public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
    
    //1. Write a public 3 argument constructor with arguments – employeeId, employeeName and basicPay.  
    
    
    
	
	//2. Implement the  - public void calculateSalary() - method   
    
    
    
}