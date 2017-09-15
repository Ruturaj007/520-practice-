<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
<link href='https://bootswatch.com/sandstone/bootstrap.min.css' rel='stylesheet' type='text/css' >

</head>
<body>
<div class="page-header">
<h1><a href="CSJobs" >CS Jobs </a> >  <a href="ViewApplicant">Applicants</a> > Add New Applicant</h1>

</div>
<form action="AddApplicant" method="post">
<div class="form-group">
 <label for="name">Name :</label>
    <input name="name" type="text" class="form-control" id="name" aria-describedby="jobHelp" placeholder="Enter your name">
    
<small id="jobHelp" class="form-text text-muted">Please enter your name carefully</small>

   <label for="degree">Degree :</label>
    <input name="degree" type="text" class="form-control" id="degree" aria-describedby="jobHelp" placeholder="Enter your Degree">
    
<small id="jobHelp" class="form-text text-muted">Please enter your degree carefully</small>

 <label for="uni">Uni :</label>
    <input name="uni" type="text" class="form-control" id="uni" aria-describedby="jobHelp" placeholder="Enter your University">
    
<small id="jobHelp" class="form-text text-muted">Please enter your Universities name carefully</small>

 <label for="year">Year :</label>
    <input name="year" type="text" class="form-control" id="year" aria-describedby="jobHelp" placeholder="Enter your year">
    <input type="hidden" name="id" value="${entry.id}" />
<small id="jobHelp" class="form-text text-muted">Please enter your Year in numbers carefully</small>

</div>
</form>
</body>
</html>