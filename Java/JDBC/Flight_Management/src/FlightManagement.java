import java.sql.*;
public class FlightManagement {
    public  boolean addFlight(Flight flightObj){
        DB db=new DB();
       try{
        Connection conn=db.getConnection();
        Statement stm=conn.createStatement();
        int flightid=flightObj.getFlightId();
        String source= flightObj.getSource();

        String destination=flightObj.getDestination();

        int noofseats=flightObj.getNoOfSeats();

        double flightfare= flightObj.getFlightFare();
        PreparedStatement pst=conn.prepareStatement("INSERT INTO flight(flightId,source,destination,noOfSeats,flightFare)"+"VALUE(?,?,?,?,?)");
        pst.setInt(1,flightid);
        pst.setString(2,source);
        pst.setString(3,destination);
        pst.setInt(4,noofseats);
        pst.setDouble(5,flightfare);
        int count= pst.executeUpdate();
        if(count>0){
            return true;

        }
        else{
            return false;
        }

    }
    catch (Exception e){
        return false;
    }
        

        
        
    }
}
