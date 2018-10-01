package sqldemo;

import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.ResultSet;
 import java.sql.SQLException;
import java.sql.Statement;


public class connecting {

	public static void main(String[] args) {
		//声明Connection对象
        Connection con;
        //驱动程序名
        String driver = "com.mysql.jdbc.Driver";
        //URL指向要访问的数据库名mydata
        String url = "jdbc:mysql://localhost:3306/book";
        //MySQL配置时的用户名
        String user = "root";
        //MySQL配置时的密码
        String pwd = "mysql123";
        
        //遍历查询结果集
        try {
            //加载驱动程序
            Class.forName(driver);
            //1.getConnection()方法，连接MySQL数据库！！
            con = DriverManager.getConnection(url,user,pwd);
            if(!con.isClosed())
                System.out.println("Succeeded connecting to the Database!");
            //2.创建statement类对象，用来执行SQL语句！！
            Statement statement = con.createStatement();
            //要执行的SQL语句
            String sql = "select * from emp";
            
            //3.ResultSet类，用来存放获取的结果集！！
            ResultSet rs = statement.executeQuery(sql);
            
           
            System.out.println("-----------------");
            System.out.println("执行结果如下所示:");  
            System.out.println("-----------------");  
           System.out.println("姓名" + "\t" + "职位"+ "\t"+"入职时间");  
            System.out.println("-----------------");  
        
            String name= null;
            String job = null;
            String ti=null;
            while(rs.next()){
                //获取stuid这列数据
                name = rs.getString("ename");
                //获取stuname这列数据
                job = rs.getString("job");
                ti=rs.getString("hiredate");
                //输出结果
               System.out.println(name+ "\t" + job+"\t" +ti);
            }
  
            rs.close();
            con.close();
        } catch(ClassNotFoundException e) {   
            //数据库驱动类异常处理
            System.out.println("Sorry,can`t find the Driver!");   
            e.printStackTrace();   
            } catch(SQLException e) {
            //数据库连接失败异常处理
            e.printStackTrace();  
           }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            System.out.println("数据库数据成功获取！！");
        }
	}

}
