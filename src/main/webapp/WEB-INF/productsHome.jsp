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
  <div class="row justify-content-around">
  <div class="text-left">
    <h1>Products</h1>
  </div>
    <div class="text-right">
    <a href="/" class="btn btn-info">Home</a>
    <a href="/products/new" class="btn btn-success">New Product</a>
    </div>
  </div>
    <div class="row mt-5">
    <c:forEach items="${product}" var="product">
  <div class="col-4">
    <p><a href="/products/${product.id}" class="btn btn-warning text-dark">${product.name}</a></p>
  </div>
    </c:forEach>
   
  </div>
  </div>
</body>
</html>