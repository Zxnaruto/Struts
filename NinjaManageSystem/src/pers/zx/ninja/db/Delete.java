package pers.zx.ninja.db;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;


public class Delete {
	
	public int Del(int Id,String Level){
		int temp=0;
		Connection conn=null;
	    conn=SqlConnection.Sqlconn();
	    
	    
		try {
			String SqlDelete="DELETE FROM Ninja WHERE NinjaId='"+Id+"' AND NinjaLevel='"+Level+"'";	 
			PreparedStatement ps=conn.prepareStatement(SqlDelete);
			//ResultSet rs=ps.executeQuery("select * from Ninja");
		
			
			temp=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("É¾³ýÊ§°Ü£¡£¡£¡");
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
		return temp;
	}
	
	
}
