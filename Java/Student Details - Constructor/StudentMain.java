import java.util.*;
public class StudentMain {
    public static void main(String[] args)
    {
        while(true)
        {
            Scanner sc=new Scanner(System.in);
        
            System.out.println("Enter Student's Id:");
            int sid=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Student's Name:");
            String sname=sc.nextLine();
            System.out.println("Enter Student's address:");
            String sadd=sc.nextLine();
            System.out.println("Whether the student is from NIT(Yes/No):");
            String op=sc.nextLine();
            op=op.toUpperCase();
            if(op.equals("NO"))
            {
                System.out.println("Enter the college name:");
                String scol=sc.nextLine();
                Student st=new Student(sid,sname,sadd,scol);
                System.out.println("Student id:"+String.valueOf(st.getStudentId()));
                System.out.println("Student Name:"+st.getStudentName());
                System.out.println("Student Name:"+st.getStudentAddress());
                System.out.println("Student Name:"+st.getCollegeName());
                break;
    
            }
            else if(op.equals("YES"))
            {
                Student st=new Student(sid,sname,sadd);
                System.out.println("Student id:"+String.valueOf(st.getStudentId()));
                System.out.println("Student Name:"+st.getStudentName());
                System.out.println("Student Name:"+st.getStudentAddress());
                System.out.println("Student Name:"+st.getCollegeName());
                break;
            }
            else
            {
                System.out.println("Wrong Input");
                continue;
            }
        }
        
        
    }
}
