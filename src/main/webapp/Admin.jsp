<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Admin Page</title>
</head>
<body>
<h1>model.User Information</h1>
<table>
  <tr>
    <th>ID</th>
    <th>Username</th>
    <th>Email</th>
    <th>Phone Number:</th>
  </tr>
</table>
<c:forEach var="User" items="${userList}">
  <tr>
    <td><c:out value="${user.id}"/></td>
    <td><c:out value="${user.name}"/></td>
    <td><c:out value="${user.email}"/></td>
    <td><c:out value="${user.phoneNum}"/></td>
  </tr>
</c:forEach>
</body>
</html>