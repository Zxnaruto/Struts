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
 * ��������ѡ���������
 */
public class Show {
    
	@SuppressWarnings("rawtypes")
	public List SqlShow(String level){
	 List<NinjaMessage> list = new ArrayList<NinjaMessage>();  //��һ��list������������еĶ��� 
		Connection conn=null;
	    conn=SqlConnection.Sqlconn();
	
	    
		try {
			String SqlShow="SELECT * FROM Ninja WHERE NinjaLevel='"+level+"'";	 
			PreparedStatement ps=conn.prepareStatement(SqlShow);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()){
				
			 NinjaMessage ninja=new NinjaMessage();//����÷ŵ������Ȼÿ�ηŵ�list�Ķ���ͬһ������
			 
			 ninja.setNinjaId(rs.getInt("NinjaId"));
			 ninja.setNinjaName(rs.getString("NinjaName"));
			 ninja.setNinjaSex(rs.getString("NinjaSex"));
			 ninja.setNinjaAge(rs.getInt("NinjaAge"));
			 ninja.setNinjaLevel(rs.getString("NinjaLevel"));
			 list.add(ninja);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("showʧ�ܣ�����");
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
