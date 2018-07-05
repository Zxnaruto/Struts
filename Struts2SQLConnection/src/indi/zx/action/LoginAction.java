package indi.zx.action;

import indi.zx.bean.UserBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport{

    //private String password;
   // private String user;
	//private String name; 
	private UserBean user;
	private static String name;//jsp��name
	
	public String execute(){
		String ret=ERROR;
		Connection conn = null;
	          
		try {
			String URL="jdbc:mysql://localhost:3306/h5_sql?useSSL=false";
			Class.forName("com.mysql.jdbc.Driver");
		    conn=DriverManager.getConnection(URL, "root", "19960213zx");
		    String sql="SELECT UserId FROM user WHERE UserName='"+user.getUserName()+"'and UserPassword='"+user.getUserPassword()+"'";
		//sql+="user=? AND password=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		//ps.setString(1, user);
		//ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
        name=user.getUserName();
			ret= SUCCESS;
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
		
			ret=ERROR;
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
		
		return ret;
		
	}
	
	public String Insert(){
		String ret=ERROR;
		Connection conn = null;
	          
		try {
			String URL="jdbc:mysql://localhost:3306/h5_sql?useSSL=false";
			Class.forName("com.mysql.jdbc.Driver");
		    conn=DriverManager.getConnection(URL, "root", "19960213zx");
	    String sql="INSERT INTO user(UserId,UserName,UserPassword) VALUES(?,?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery("select * from user");
		rs.last();//������Ƶ����һ��
		ps.setInt(1, rs.getRow()+1);//��������values���ʺŵ�ֵ����ֵ����Ϊ��ײ�
		ps.setString(2, user.getUserName());
		ps.setString(3, user.getUserPassword());
	    int count=ps.executeUpdate();
	    if(count==1){
	    	System.out.println("����ɹ�,���½����");
	    	return SUCCESS;
	    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
		
			ret=ERROR;
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
		
		return ret;
	}
	
	public String Delete(){
		String ret=ERROR;
		Connection conn = null;
	          
		try {
			String URL="jdbc:mysql://localhost:3306/h5_sql?useSSL=false";
			Class.forName("com.mysql.jdbc.Driver");
		    conn=DriverManager.getConnection(URL, "root", "19960213zx");
	    String sql="DELETE FROM user WHERE UserName='"+getName()+"'";
	
		PreparedStatement ps=conn.prepareStatement(sql);

		
		//ps.setInt(1, user.getUserId());//��������values���ʺŵ�ֵ
	    int count=ps.executeUpdate();
	    if(count==1){
	    	System.out.print("ɾ���ɹ�,���½����");
	    	return SUCCESS;
	    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
		
			ret=ERROR;
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
		
		return ret;
	}
	
	public String Update(){
		String ret=ERROR;
		Connection conn = null;
	          
		try {
			String URL="jdbc:mysql://localhost:3306/h5_sql?useSSL=false";
			Class.forName("com.mysql.jdbc.Driver");
		    conn=DriverManager.getConnection(URL, "root", "19960213zx");
	    String sql="UPDATE user SET UserPassword='"+user.getUserPassword()+"' WHERE UserName='"+getName()+"'";
	
		PreparedStatement ps=conn.prepareStatement(sql);

		
		//ps.setString(1, user.getUserPassword());//��������values���ʺŵ�ֵ
		//ps.setString(2, user.getUserName());//��������values���ʺŵ�ֵ
	    int count=ps.executeUpdate();
	    if(count==1){
	    	System.out.print("�޸ĳɹ�,���½����");
	    	return SUCCESS;
	    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
		
			ret=ERROR;
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
		
		return ret;
	}
	public UserBean getUser() {
		return user;
	}
	public void setUser(UserBean user) {
		this.user = user;
	}
	public String getName() {
		return name;
	}
	@SuppressWarnings("static-access")
	public void setName(String name) {
		this.name = name;
	}
	
	
}
