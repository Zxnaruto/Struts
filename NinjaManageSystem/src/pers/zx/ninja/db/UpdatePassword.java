package pers.zx.ninja.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatePassword {

public String UpdaPassword(String password,String name){
		
		Connection conn=null;
	    conn=SqlConnection.Sqlconn();
	    
		try {
			String SqlPasswordUpDate="UPDATE Ninja SET NinjaPassword='"+password+"' WHERE NinjaName='"+name+"'";	 
			PreparedStatement ps=conn.prepareStatement(SqlPasswordUpDate);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("√‹¬Î–ﬁ∏ƒ ß∞‹£°£°£°");
		}finally{
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
		return "updatepassword";
}
}
