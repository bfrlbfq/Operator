package sqltest;

import java.sql.*;
public class demo3 {

	public static void insertdata(Connection con)
	{
          try{
        	  PreparedStatement psql=con.prepareStatement("insert into shop values(5,'风衣',359.8)");
        	  psql.executeUpdate();
        	  psql.close();
          }catch(SQLException e){
        	  e.printStackTrace();
          }catch(Exception e){
        	  e.printStackTrace();
          }finally{
        	  System.out.println("数据库数据插入成功!");
          }
	}
	
	
	public static void main(String[] args) {
		Connection con;
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/book";
		String user="root";
		String pwd="mysql123";
		
		try{
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, pwd);
			if(!con.isClosed())
				System.out.println("数据库连接成功！");
			    insertdata(con);
			
			   con.close(); 			   	
		}catch(ClassNotFoundException e){  
            System.out.println("数据库连接失败");
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            System.out.println("添加数据操作成功！");
        }

	}

}
