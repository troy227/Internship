package Stu;
public class Student {
    protected int studentId, departmentId;
    protected String gender, phone,name;
    
    public int getStudentId(){
        return studentId;
    }

    public void setStudentId(int sid){
        studentId=sid;
    }

    public int getDepartmentId(){
        return departmentId;
    }

    public void setDepartmentId(int did){
        departmentId=did;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String s){
        gender=s;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String s){
        phone=s;
    }

    public String getName(){
        return name;
    }

    public void setName(String s){
        name=s;
    }
}
