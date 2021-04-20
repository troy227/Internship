
import java.util.ArrayList;
import java.sql.*;
public class TrainManagementSystem {
	
	public ArrayList <Train> viewTrain (String coachType, String source, String destination){
		ArrayList<Train> ar=new ArrayList<Train>();
		DB db = new DB();
		try{
		    
		    Connection conn=db.getConnection();
		    //Statement st=conn.createStatement();
		    Statement p=conn.createStatement();
		    PreparedStatement pst=conn.prepareStatement("SELECT * from train where source =? and destination =? and "+coachType+">0 order by train_number");
		    pst.setString(1,source);
		    pst.setString(2,destination);
		    //pst.setString(3,coachType);
		    
		    ResultSet rs=pst.executeQuery();
		    //System.out.println(pst);
		    
		    while(rs.next()){
		        String name=rs.getString("train_name");
		        int number=rs.getInt("train_number");
		        String s=rs.getString("source");
		        String d=rs.getString("destination");
		        int ac1=rs.getInt("ac1");
		        int ac2=rs.getInt("ac2");
		        int ac3=rs.getInt("ac3");
		        int sleep=rs.getInt("sleeper");
		        int seat=rs.getInt("seater");
		        //System.out.println("Train- "+m);
		        
		        Train obj=new Train(number,name,s,d,ac1,ac2,ac3,sleep,seat);
		        ar.add(obj);
		        //System.out.println("ar size"+ar.size());
		        
		    }
		    return ar;
		    
		    
		    
		    
		}
		catch (Exception e){
		    
		}
		return ar;
		
		
	}

}
