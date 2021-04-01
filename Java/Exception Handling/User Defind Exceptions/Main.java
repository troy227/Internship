package Exceptions;
import java.util.*;
public class Main {
    public static Candidate getCandidateDetails() throws InvalidSalaryException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the candidate Details");
        System.out.println("Name");
        String name=sc.nextLine();
        System.out.println("Gender");
        String gender=sc.nextLine();
        System.out.println("Expected Salary");
        double expectedSalary=sc.nextDouble();
        if(expectedSalary<10000){
            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000");
            
        }
        Candidate can=new Candidate();
        can.setExpectedSalary(expectedSalary);
        can.setGender(gender);
        can.setName(name);
        return can;
    }
    public static void main(String[] args) {
        try{
            getCandidateDetails();
            System.out.println("Registration Successful");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
