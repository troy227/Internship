package Mall_Parking_System;


import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("In-time");
        String inTime=sc.nextLine();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm");
        sdf.applyPattern("dd/MM/yyyy HH:mm");
        sdf.setLenient(false);
        String currentTime="29/10/2019 20:10";
        try {
            try{
                Date inDate=sdf.parse(inTime);
            }
            catch(ParseException e){
                System.out.println(inTime+" is an Invalid In-Time");
            }
            Date inDate=sdf.parse(inTime);
            Date curDate=sdf.parse(currentTime);
            if(curDate.getTime()-inDate.getTime()<=0){
                System.out.println(inTime+" is an Invalid In-Time");
                System.exit(0);
            }
            System.out.println("Out-time");
            String outTime=sc.nextLine();
            try{
                Date outDate=sdf.parse(outTime);
            }
            catch (ParseException e){
                System.out.println(outTime+" is an Invalid Out-Time");
            }
            Date outDate=sdf.parse(outTime);
            if(outDate.getTime()-inDate.getTime()<=0){
                System.out.println(outTime+" is an Invalid Out-Time");
                System.exit(0);
            } 
            double totalTime=outDate.getTime()-inDate.getTime();
            double totalHours=1;
            if(totalTime<3600000){
                totalHours=1;
            }
            else{
                totalHours=Math.ceil(totalTime/3600000);
            }
            System.out.println((int)totalHours*10+" Rupees");
        }   
        catch (ParseException e) {
            
            System.exit(0);
            
        }
    
}
}
