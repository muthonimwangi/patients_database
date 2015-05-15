
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 5/13/2015
  Time: 3:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Drugs</title>
</head>
<body>

<c:if test="${not empty error}">
    <div class="error">${error}</div>
</c:if>
<c:if test="${not empty msg}">
    <div class="msg">${msg}</div>
</c:if>
<c:if test="${not empty message}">
    <div class="msg">${message}</div>
</c:if>

<form action="<c:url value='/add' />" method='POST'>
    <select name = "patient_id" required>
        <c:forEach var="list"  items="${patientList}">
            <option value="${list.id}">${list.fname}</option>
        </c:forEach>
    </select>
    <br>
    <%--<input type="text" placeholder="Patient ID" name="patient_id" required><br>--%>
    <input type="text" placeholder="Drug Name" name="drug_name" required><br>

    <button> Add</button>

</body>
</html>
