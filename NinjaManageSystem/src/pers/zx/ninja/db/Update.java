package pers.zx.ninja.db;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;

public class Update {
  
	public int Upda(int id,String level){
		
		int temp=0;//返回数据插入项数
		Connection conn=null;
	    conn=SqlConnection.Sqlconn();
	
		try {
			String SqlUpDate="UPDATE Ninja SET NinjaLevel='"+level+"' WHERE NinjaId='"+id+"'";	 
			PreparedStatement ps=conn.prepareStatement(SqlUpDate);
		
			
			
			temp=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("修改失败！！！");
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
