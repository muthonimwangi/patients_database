<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 5/13/2015
  Time: 4:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<table>
<tbody>
  <thead>
  <th>patientid</th>
  <th>drugname</th>
  </thead>
</tbody>
<c:forEach var="to_list"  items="${drugdetailsList}">
  <tr>
        <td>${to_list.patientid}</td><br>
        <td>${to_list.drugname}</td><br>

  </tr>
</c:forEach>
</table>

</body>
</html>
