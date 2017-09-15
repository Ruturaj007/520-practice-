<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Admin Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
<!-- <link rel='stylesheet' href='cdnjs.cloudflare.com/ajax/libs/highlight.js/9.12.0/styles/default.min.css'>
 -->			
</head>
<body>
<div class="page-header">
<h1><a href="CSJobs" >CS Jobs </a> >  <a href="Admin">Admin</a></h1>
<h2> <a href="AddJob">Post new job openings</a></h2>
</div>
<table class="table table-bordered table-striped table-hover" border="0">
<tr><th>Job</th><th>Posted On</th><th> View</th></tr>
<c:forEach items="${entries}" var="entry">
  <tr>
    
    <td>${entry.job}
   
    </td>
  	<td>${entry.date}</td> 
  	 
    <td><a href="ViewApplicant?id=${entry.id}">View Applicant</a></td>
     <input type="hidden" name="id" value="${entry.id}"></input>
     <%-- <%  String id1 ={entry.id};
    session.setAttribute("id1", id1); %> --%>
  </tr>
</c:forEach>
</table>
</body>
</html>