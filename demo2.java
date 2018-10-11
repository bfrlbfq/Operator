package sqltest;


import java.sql.*;
public class demo2 {
	        
	     static String sql="create table shop(id int,name varchar(50),price  float)";
	     final static String driver="com.mysql.jdbc.Driver";
	     final static String url="jdbc:mysql://localhost:3306/book";
	     final static String user="root";
	     final static String pwd="mysql123";
	public static void main(String[] args){
		   Connection con;
		   Statement stmt;
		  
		   try
		          {
		              
		              Class.forName(driver);
		              System.out.println("连接数据库");
		              con = DriverManager.getConnection(url,user,pwd);
		              System.out.println("创建表");
		              stmt = con.createStatement();
		              
		             if(0 == stmt.executeUpdate(sql))
		             {
		                 System.out.println("成功创建表！");
		             }
		             else
		             {
		                 System.out.println("创建表失败！");
		             }
		             
		              stmt.close();
		              con.close();
		              System.out.println("关闭资源");
		          }
		          catch(Exception e)
		          {
		              System.out.println("创建表失败！");
		              e.printStackTrace();
		          }
	
		   
	}
}





