package Stu;

public class Hosteller extends Student {
    private String hostelName;
    private int roomNumber;

    public String getHostelName(){
        return hostelName;
    }

    public void setHostelName(String s){
        hostelName=s;
    }

    public int getRoomNumber(){
        return roomNumber;
    }

    public void setRoomNumber(int rn){
        roomNumber=rn;
    }
}
