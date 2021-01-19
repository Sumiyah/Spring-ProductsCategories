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
    <h1>Product: ${product.name} </h1>
    <a href="/products/new" class="btn btn-success">New Product</a>
    <a href="/products" class="btn btn-info">Back to Products</a>
  </div>
  <div class="row justify-content-around mt-5">
    <h5>Description: ${product.description}</h5>
    <br>
    <h6>Price: $ ${product.price}</h6>
    
  </div>
    
		
		<div class="row justify-content-around mt-5">
   
    <div class="col-sm-6">
    <h4>Categories of this Product:</h4>
   <ul class="list-group">
    <c:forEach items ="${product.categories}" var="item">
    <li class="list-group-item text-dark"><a href="/categories/${item.id }" class="text-dark">${item.name}</a></li>
    </c:forEach>
    </ul> 
    </div>
    
    <div class="col-sm-6">	
		<form action="/associations/products" method="POST" modelAttribute="association">
			<input type="hidden" name="product" value="${ product.id }"/>
			<div class="form-group">
		        <label name="category">Add a Category</label>
		        
		        <select class="form-control" name="category">
		        <c:forEach items="${ notInCat  }" var="nonCat">
		        	<option value=${ nonCat.id }>${ nonCat.name }</option>
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