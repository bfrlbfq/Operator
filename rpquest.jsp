<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>dynamic web</title>
</head>
<body>
  <h1>request内置对象</h1>
         <%
         		request.setCharacterEncoding("utf-8");  //解决中文乱码问题  无法解决URL传参数中文乱码问题 
         		request.setAttribute("password", "135796");
         %>
     用户名：<%= request.getParameter("username")  %><br>
     爱好：   <% 
                   if(request.getParameterValues("favorite")!=null )
                   {
                        String[ ] favorites=request.getParameterValues("favorite");
                        for(int i=0;i<favorites.length;i++)
                        {
                        	out.println(favorites[i]+"&nbsp;&nbsp;");
                        }
                        
                   }  
                  	 %>
           <br>
           
       密码：<%= request.getAttribute("password") %><br>
       请求体的MIME类型：<%=request.getContentType()  %><br>
       协议类型及版本：<%=request.getProtocol()  %><br>
       服务器主机名：<%=request.getServerName()  %><br>
       服务器端口号:<%=request.getServerPort()  %><br>
       请求文件的长度：<%=request.getContentLength() %><br>
       请求客户端的IP地址：<%=request.getRemoteAddr()  %><br>
       请求的真是路径：<%=request.getRealPath("rpquest.jsp")  %><br>
       请求的上下文路径:<%=request.getContextPath() %><br>	                  	 
                  	 
</body>
</html>