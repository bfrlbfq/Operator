<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%@ page import="java.text.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>jsp</title>
</head>
<body>
  <%!
  		String multitable1()
  		{
	  			String s="";
	  			for(int i=1;i<=9;i++)
	  			{
	  				for(int j=1;j<=i;j++)
	  				{
	  					s+=j+"x"+i+"="+(j*i)+"&nbsp;&nbsp;&nbsp;&nbsp;";
	  				}
	  				
	  				s+="<br>";
	  			}
	  			return s;
  		}

        //jsp内置out对象，使用脚本方式调用
        void multitable2(JspWriter out)  throws Exception
        {
        	for(int i=1;i<=9;i++)
  			{
  				for(int j=1;j<=i;j++)
  				{
  					out.println( j+"x"+i+"="+(j*i)+"&nbsp;&nbsp;&nbsp;&nbsp;");
  				}	
  				out.println("<br>");
  			}
        }
    
  %>
  

 <h1 style="text-align:center;">九九乘法表</h1>
 <hr>
    <%=multitable1()%>
    <br>
    <hr>
    <% multitable2(out); %>
    <br>
    <hr>
</body>
</html>