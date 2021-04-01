public class Student {
    private int studentId;
    private String studentName, studentAddress, collegeName;
    public int getStudentId()
    {
        return studentId;
    }
    public void setStudentId(int n)
    {
        studentId=n;
    }
    public String getStudentName()
    {
            return studentName;
    }
    public void setStudentName(String n)
    {
        studentName=n;
    }
    public String getStudentAddress()
    {
        return studentAddress;
    }
    public void setStudentAddress(String  n)
    {
        studentAddress=n;
    }
    public String getCollegeName()
    {
        return collegeName;
    }
    public void setCollegeName(String  n)
    {
        collegeName=n;
    }
    public Student(int studentId,String studentName,String studentAddress)
    {
        this.collegeName="NIT";
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentAddress=studentAddress;
    }
    public Student(int studentId,String studentName,String studentAddress,String collegeName)
    {
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentAddress=studentAddress;
        this.collegeName=collegeName;
    }
}
