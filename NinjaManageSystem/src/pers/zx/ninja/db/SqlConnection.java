package pers.zx.ninja.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqlConnection {

	private static Connection conn=null;
	
	public static Connection Sqlconn(){
		
		try{
			String URL="jdbc:mysql://localhost:3306/h5_sql?useSSL=false";
			Class.forName("com.mysql.jdbc.Driver");
		    conn=DriverManager.getConnection(URL, "root", "19960213zx");
		}catch(Exception e){
			System.out.println("Êý¾Ý¿âÁ´½ÓÊ§°Ü£¡£¡£¡");
		}
		return conn;
	}
}
