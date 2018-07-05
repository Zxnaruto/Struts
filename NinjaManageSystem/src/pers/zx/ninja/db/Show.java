package pers.zx.ninja.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pers.zx.ninja.bean.NinjaMessage;

/**
 * @author Administrator
 * 根据类型选择表中数据
 */
public class Show {
    
	@SuppressWarnings("rawtypes")
	public List SqlShow(String level){
	 List<NinjaMessage> list = new ArrayList<NinjaMessage>();  //用一个list对象来添加所有的对象 
		Connection conn=null;
	    conn=SqlConnection.Sqlconn();
	
	    
		try {
			String SqlShow="SELECT * FROM Ninja WHERE NinjaLevel='"+level+"'";	 
			PreparedStatement ps=conn.prepareStatement(SqlShow);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()){
				
			 NinjaMessage ninja=new NinjaMessage();//这个得放到这里，不然每次放到list的都是同一个对象
			 
			 ninja.setNinjaId(rs.getInt("NinjaId"));
			 ninja.setNinjaName(rs.getString("NinjaName"));
			 ninja.setNinjaSex(rs.getString("NinjaSex"));
			 ninja.setNinjaAge(rs.getInt("NinjaAge"));
			 ninja.setNinjaLevel(rs.getString("NinjaLevel"));
			 list.add(ninja);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("show失败！！！");
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
		
	
	
	   return list;
	}
	
}
