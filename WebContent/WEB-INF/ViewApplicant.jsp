<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Applicationts listed here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
<link href='https://bootswatch.com/sandstone/bootstrap.min.css' rel='stylesheet' type='text/css' >
</head>
<body>
<div class="page-header">
<h2>Job Positions =<c out value =${request.getAttribute("job")}/></h2>
</div>
<table class="table table-bordered table-striped table-hover" border="0">
<tr><th>Applicant</th><th>Applied On</th></tr>
<c:forEach items="${entries}" var="entry">
<c:forEach items="${entries1}" var="entry2">
<tr>
     <td><c:out value="${request.getAttribute("job")}"/></td>
    <td>${entry2.name}</td>
  	<td>${entry.date}</td>
  	</tr> 
</c:forEach>
</c:forEach>
</table>
</body>
</html>