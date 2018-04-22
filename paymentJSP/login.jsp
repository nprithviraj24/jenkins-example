<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<html>
 <head>
  <title> jsp page </title>
 </head>
     
       <h1>jsp page</h1>
	<% 
	int flag=0;
	String username=request.getParameter("login");
	String password=request.getParameter("password");
	try
	{

	Class.forName("org.postgresql.Driver");
	Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","tiger");
	Statement ps=con.createStatement();
	ResultSet rs=ps.executeQuery("select * from users");
	out.println("Result set executed");
	while(rs.next())
	{
		if((rs.getString(1).equals(username)) && (rs.getString(2).equals(password)))
		{
			flag=1;
		}
		
	} 
	if(flag==1)
	{
		out.println("valid user");

		RequestDispatcher rd = request.getRequestDispatcher("payment.html");
		rd.include(request, response);
	}
	else
	{	out.println("Invalid User");
	}

	 }
	catch(Exception e)
	{
	     out.println(e);
	    e.printStackTrace();
	}
out.close();
%>
  
</html>
