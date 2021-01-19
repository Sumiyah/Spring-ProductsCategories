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
  <div class="container mt-5">
  <div class="row justify-content-around">
    <h1>${category.name} Category</h1>
    <a href="/categories/new" class="btn btn-success">New Category</a>
    <a href="/categories" class="btn btn-info">Back to Categories</a>
  </div>
  
    <div class="row justify-content-around mt-5">
   
    <div class="col-sm-6">
    <h4>Products in this category:</h4>
   <ul class="list-group">
    <c:forEach items ="${category.products}" var="item">
    <li class="list-group-item text-dark"><a href="/products/${item.id }" class="text-dark">${item.name}</a></li>
    </c:forEach>
    </ul> 
    </div>
    
    <div class="col-sm-6">
    <form action="/associations/categories" method="POST" modelAttribute="association">
			<input type="hidden" name="category" value="${ category.id }"/>
			<div class="form-group">
		        <label name="product">Pick a Product</label>
		        
		        <select class="form-control" name="product">
		        <c:forEach items="${ notInPro  }" var="nonPro">
		        	<option value=${ nonPro.id }>${ nonPro.name }</option>
		        </c:forEach>
		        </select>
		    </div>
		    <button class="btn btn-primary">Add</button>
		</form>
    </div>
    </div>
    
  </div>
</body>
</html>