package Stu;
import java.util.*;
public class Main{
    public static void main(String[] args){
        getHostellerDetails();
    }
    public static Hosteller getHostellerDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Details:");
        System.out.println("Student Id");
        int sid=sc.nextInt();
        sc.nextLine();
        System.out.println("Student Name");
        String sname=sc.nextLine();
        System.out.println("Department Id");
        int dep=sc.nextInt();
        sc.nextLine();
        System.out.println("Gender");
        String gen=sc.nextLine();
        System.out.println("Phone Number");
        String phone=sc.nextLine();
        System.out.println("Hostel Name");
        String hostel=sc.nextLine();
        System.out.println("Room Number");
        int room=sc.nextInt();
        System.out.println("Modify Room Number(Y/N)");
        sc.nextLine();
        String choice=sc.nextLine();
        if(choice.equals("Y")){
            System.out.println("New Room Number");
            room=sc.nextInt();
            sc.nextLine();
        }
        
        System.out.println("Modify Phone Number(Y/N)");
        choice=sc.nextLine();
        if(choice.equals("Y")){
            System.out.println("New Phone Number");
            phone=sc.nextLine();
            sc.nextLine();
        }
        Hosteller h=new Hosteller();
        h.setHostelName(hostel);
        h.setRoomNumber(room);
        h.setStudentId(sid);
        h.setDepartmentId(dep);
        h.setGender(gen);
        h.setName(sname);
        h.setPhone(phone);
        return h;

        
    }
}
