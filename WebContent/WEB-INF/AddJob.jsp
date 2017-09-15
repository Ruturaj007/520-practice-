<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Adding Job</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
<link href='https://bootswatch.com/sandstone/bootstrap.min.css' rel='stylesheet' type='text/css' >
</head>
<body>
<div class="page-header">
<h1><a href="CSJobs" >CS Jobs </a> >  <a href="Admin">Admin</a> > New Job Opening</h1>

</div>
<form action="AddJob" method="post">
 <div class="form-group">
    <label for="job">Job :</label>
    <input name="job" type="text" class="form-control" id="job" aria-describedby="jobHelp" placeholder="Enter JOB">
    <input type="hidden" name="id" value="${entry.id}" />
<small id="jobHelp" class="form-text text-muted">Please enter your job carefully</small>
  </div>

 <button type="submit" class="btn btn-primary">Post</button>
<!-- <input type="submit" name="add" value="Post" /> -->
</form>
</body>
</html>