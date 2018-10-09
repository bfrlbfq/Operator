package sqltest;

/*import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;*/
import java.sql.*;
public class time {
	   
				public static void main(String[] args){
					Connection con;
					String driver="com.mysql.jdbc.Driver";
					String url="jdbc:mysql://localhost:3306/book";
					String user="root";
					String pwd="mysql123";
					
					try{
						  Class.forName(driver);
						  con=DriverManager.getConnection(url, user, pwd);
						  if(!con.isClosed())
							  System.out.println("数据库连接成功!");
						  	  Statement statement=con.createStatement();
						  	  String sql="select  now() as time";
						  	  ResultSet rs=statement.executeQuery(sql);
						  	 
						  	  
						  	  String time=null;
						            while(rs.next()){
						                time=rs.getString("time");
						                
						                //输出结果
						               System.out.println(time);
						            }
						  	  
						  	  
						  	 rs.close();
						  	 con.close();
					}catch(ClassNotFoundException e){
						   System.out.println("数据库连接失败");
						   e.printStackTrace();
					}catch(SQLException e){
						e.printStackTrace();
					}catch(Exception e){
						e.printStackTrace();
					}finally{
						 System.out.println("数据库数据成功获取！");
					}
			
				}
	
}
