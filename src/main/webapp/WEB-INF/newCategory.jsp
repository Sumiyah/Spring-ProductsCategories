<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Products and Categories</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
    <script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
    <script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
  <div class="container text-center mt-5">
    <h1>New Category</h1>
    <div class="row justify-content-center mt-3">
			<form:form action="/categories" method="post"
				modelAttribute="category">
				<div class="form-group">
					<form:label path="name">Name:</form:label>
					<form:errors path="name" />
					<form:input path="name" />
				</div>
				<input type="submit" value="Create" class="btn btn-primary"/>
				<a href="/categories" class="btn btn-danger">Cancel</a>
			</form:form>
		</div>
  </div>
</body>
</html>