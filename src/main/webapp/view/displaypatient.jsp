
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 5/13/2015
  Time: 12:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<div class = "navbar navbar-default">Patient List</div>
<table>
  <tr>
    <thead>
    <th>patientid</th>
    <th>first name</th>
    <th>last name</th>
    <th> Date of birth</th>
    </thead>
  </tr>
  <c:forEach var="to_list"  items="${detailsList}">
    <tr>
      <td>${to_list.id}</td>
      <td>${to_list.fname}</td>
        <td>${to_list.lname}</td>
        <td>${to_list.dob}</td>
    </tr>
  </c:forEach>
</table>

</body>
</html>
