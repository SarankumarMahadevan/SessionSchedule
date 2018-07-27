<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Scheduled Sessions</h2>
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Session Name</th><th>Duration(Days)</th><th>Faculty</th><th>Mode</th></tr>  
   <c:forEach var="ScheduledSessions" items="${courses}">   
   <tr>  
   <td>${ScheduledSessions.id}</td>  
   <td>${ScheduledSessions.name}</td>  
   <td>${ScheduledSessions.duration}</td>  
   <td>${ScheduledSessions.faculty}</td>
    <td>${ScheduledSessions.mode1}</td>
   <td><a href="update">EnrollMe</a></td>
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <br/>  
</body>
</html>