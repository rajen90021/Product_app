<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
</head>
<body>
<h1 style="text-align: center;">change product details </h1>


<div class="container mt-5">
    <div class="row">
        <div class="col-md-8 offset-md-2">
            <h3 class="mb-4">Add Product</h3>
            <form action=" ${pageContext.request.contextPath }/handle-product" method="post">
            
            <input type="hidden" value="${product.id }" name="id"/>
                <div class="form-group">
                    <label for="productName">Product Name:</label>
                    <input type="text" class="form-control" id="productName" name="name" placeholder="Enter product name" value="${product.name }" required>
                </div>
                <div class="form-group">
                    <label for="productDescription">Product Description:</label>
                    <textarea class="form-control" id="productDescription"  name="description" rows="3" placeholder="Enter product description" required>${product.description }</textarea>
                </div>
                <div class="form-group">
                    <label for="productPrice">Product Price:</label>
                    <input type="number" class="form-control" id="productPrice" name="price" placeholder="Enter product price" step="0.01"  value="${product.price }" required>
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-warning">update</button>
                    <!-- Back Button -->
                    <button type="button" class="btn btn-secondary" onclick="window.history.back();">Back</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>