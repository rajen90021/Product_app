
<html>
<head>
<%@include file="./base.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>

<div class="container mt-3">

<div class="row">
  
<div class="col-md-12">

 <h1 class="text-center mb-3">welcome to product app</h1>

      <table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">id</th>
      <th scope="col">name</th>
      <th scope="col">description</th>
      <th scope="col">price</th>
       <th scope="col">action</th>
    </tr>
  </thead>
  <tbody>
  
  <c:forEach items="${product}" var="p">
    <tr>
      <th scope="row">techonly${p.id }</th>
      <td>${p.name }</td>
      <td>${p.description }</td>
      <td class="font-weight-bold">&#8377; ${p.price }</td>
      <td><a href="delete/${p.id }"><i class="fa-solid fa-trash-can"></i></a>
      <a href="update/${p.id }"><i class="fa-solid fa-pen-nib"></i></a>
      </td>
    </tr>
    </c:forEach>
  </tbody>
</table>


<div class="container text-center">

<a href="add-product" class="btn btn-outline-success"> add product</a>



</div>
</div>

</div>

</div>



</body>
</html>