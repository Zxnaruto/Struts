package pers.zx.ninja.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class RegInsert {

	public int Ins(String name,String sex,int age,String password){
		
		int temp=0;//�������ݲ�������
		Connection conn=null;
	    conn=SqlConnection.Sqlconn();
	    
		try {
			String SqlInsert="INSERT INTO Ninja(NinjaId,NinjaName,NinjaAge,NinjaSex,NinjaLevel,NinjaPassword) VALUES(?,?,?,?,?,?)";	 
			PreparedStatement ps=conn.prepareStatement(SqlInsert);
			ResultSet rs=ps.executeQuery("select * from Ninja");
			rs.last();//������Ƶ����һ��
			ps.setInt(1, rs.getRow()+1);//��������values���ʺŵ�ֵ����ֵ����Ϊ��ײ�
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setString(4,sex);
			ps.setString(5, "����");
			ps.setString(6, password);
			temp=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("����ʧ�ܣ�����");
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
