<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Save Travels.</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<h1>Save travels.</h1>
<table class="table table-striped table-hover">
    <tr>
        <td>Expenses</td>
        <td>Vendor</td>
        <td>Amount</td>
        <td>Action</td>
    </tr>
    <tbody>
    <c:forEach items="${allTravels}" var="travel">
        <tr>
            <td><a href="/details/${travel.id}">${travel.expense}</a></td>
            <td><c:out value="${travel.vendor}"/></td>
            <td><c:out value="${travel.amount}"/></td>
            <td><a href="/edit/${travel.id}">Edit</a>
                <form:form action="/delete/${travel.id}" method="delete">
                    <button>Delete</button>
                </form:form>
            </td>
        </tr>
    </c:forEach>
    <tbody>


</table>
<h1>Add an expense:</h1>
<div class="container">

<%--@elvariable id="travel" type="java"--%>
<form:form action="/create/expenses" method="post" modelAttribute="travel">
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
    <button>Submit</button>

</form:form>
    </div>
    </body>
</html>