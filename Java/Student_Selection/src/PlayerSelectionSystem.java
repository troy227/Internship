import java.util.List;
import java.util.*;
import java.sql.*;
public class PlayerSelectionSystem {

	public List<String> playersBasedOnHeightWeight (double minHeight, double maxWeight){
		
		DB db=new DB();
		List<String> ls=new ArrayList<String>();
		try{
		    Connection conn=db.getConnection();
		    PreparedStatement pst=conn.prepareStatement("select playerName from player where height>=? and weight<=? order by playerName");
		    pst.setDouble(1,minHeight);
		    pst.setDouble(2,maxWeight);
		    ResultSet rs=pst.executeQuery();
		    while(rs.next()){
		        String name=rs.getString("playerName");
		        ls.add(name);
		    }
		    	return ls;
		}
		
	
		catch (Exception e){
		    
		}
	    return ls;
	}
}
