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
  <div class="container mt-5 text-center">
    <h1>New Product</h1>
    <div class="row justify-content-center">
			<form:form action="/products" method="post"
				modelAttribute="product">
				<div class="form-group">
					<form:label path="name">Name:</form:label>
					<form:input path="name"/>
					<form:errors path="name" class="text-danger"/>
				</div>
				<div class="form-group">
					<form:label path="description">Description:</form:label>
					<form:input path="description" />
					<form:errors path="description" class="text-danger" />
				</div>
				<div class="form-group">
					<form:label path="price">Price:</form:label>
					<form:input path="price" type="number"/>
					<form:errors path="price" class="text-danger"/>
				</div>
				<input type="submit" value="Create" class="btn btn-primary" />
				<a href="/products" class="btn btn-danger">Cancel</a>
			</form:form>
		</div>
  </div>
</body>
</html>