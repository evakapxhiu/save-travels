<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>editTravels.</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<h2>Edit Travel</h2>
<a href="/expenses">Go back</a>
<div class="container">
    <%--@elvariable id="travel" type="javax"--%>
    <form:form action="/update/${travel.id}" method="put" modelAttribute="travel">
        <p class="form-group">
            <form:label path="expense">Expense</form:label>
            <form:errors path="expense"></form:errors>
            <form:input path="expense" class="form-control"></form:input>
        </p>
        <p class="form-group">
            <form:label path="vendor">Vendor:</form:label>
            <form:errors path="vendor"></form:errors>
            <form:input path="vendor" class="form-control"></form:input>
        </p>
        <p class="form-group">
            <form:label path="amount">Amount:</form:label>
            <form:errors path="amount"></form:errors>
            <form:input path="amount" class="form-control"></form:input>
        </p>
        <div>
            <form:label path="description">Description: </form:label><br />
            <form:errors path="description" class="text-danger"/>
            <form:textarea style="width:250px;" rows="3" path="description"/>
        </div>
        <button class="btn btn-primary">Edit</button>
    </form:form>
</div>
</body>
</html>
