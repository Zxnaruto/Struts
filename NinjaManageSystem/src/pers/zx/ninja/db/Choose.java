package pers.zx.ninja.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Choose {

	private int temp_id;
	private int temp_age;
	private String temp_sex;
	private String temp_level;
	public String choose(String name,String password){
		//取数据库数据，传到jsp页面
	
		
		Connection conn=null;
	    conn=SqlConnection.Sqlconn(); 
	    String level ="ERROR";
		try {
			String SqlChoose="SELECT * FROM Ninja WHERE NinjaName='"+name+"'and NinjaPassword='"+password+"'";
			PreparedStatement ps=conn.prepareStatement(SqlChoose);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				 temp_id=rs.getInt("NinjaId");
		            temp_age=rs.getInt("NinjaAge");
		           temp_sex=rs.getString("NinjaSex");
		            temp_level=rs.getString("NinjaLevel");
	          if(rs.getString("NinjaLevel").equals("下忍")){
	        	  level="下忍";
	        	  break;
	          }else if(rs.getString("NinjaLevel").equals("中忍")){
	        	  level="中忍";
	        	  break;
	          }else if(rs.getString("NinjaLevel").equals("上忍")){
	        	  level="上忍";
	        	  break;
	          }else if(rs.getString("NinjaLevel").equals("火影")){
	        	  level="火影";
	        	  break;
	          }
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error！！！");
			return "ERROR";
			
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
		return level;
	}
	public int getTemp_id() {
		return temp_id;
	}
	public void setTemp_id(int temp_id) {
		this.temp_id = temp_id;
	}
	public int getTemp_age() {
		return temp_age;
	}
	public void setTemp_age(int temp_age) {
		this.temp_age = temp_age;
	}
	public String getTemp_sex() {
		return temp_sex;
	}
	public void setTemp_sex(String temp_sex) {
		this.temp_sex = temp_sex;
	}
	public String getTemp_level() {
		return temp_level;
	}
	public void setTemp_level(String temp_level) {
		this.temp_level = temp_level;
	}
	
	
}
