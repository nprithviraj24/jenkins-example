<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<html>
 <head>
  <title> jsp page </title>
 </head>
     
       <h1>jsp page</h1>
	<% 
	
	String n=request.getParameter("uname");
String e=request.getParameter("em");
String ea=request.getParameter("emagn");
String p=request.getParameter("pwd");
String pa=request.getParameter("pwdagn");
	try
	{

	Class.forName("org.postgresql.Driver");
	Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","tiger");
	PreparedStatement ps=con.prepareStatement(
"insert into registration values(?,?,?,?,?)");

ps.setString(1,n);
ps.setString(2,e);
ps.setString(3,ea);
ps.setString(4,p);
ps.setString(5,pa);
int i=ps.executeUpdate();

PreparedStatement ps1=con.prepareStatement(
"insert into users values(?,?)");
ps1.setString(1,n);
ps1.setString(2,p);
int k=ps1.executeUpdate();
if(i>0)
{
    out.print("You are successfully registered...");
    //response.sendRedirect("Login.html");
}
if(k>0)
{
out.println("Database updated");
}
	}
	catch(Exception er)
	{
	     out.println(er);
	    er.printStackTrace();
	}
out.close();
%>
  
</html>
