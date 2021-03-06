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
  <div class="row">
  <div class="col">
    <h1 class="text-center">Welcome to Products and Categories!</h1>
  </div>
  </div>
  <div class="row justify-content-around mt-5">
    <a href="/categories/" class="btn btn-info">Categories</a>
    <a href="/products" class="btn btn-success">Products</a>
  </div>
  </div>
</body>
</html>