<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>See Other Tables</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

<div class="container mt-3">
    <h1>Other Tables</h1>
    <table class="table">
        <thead>
            <tr>
                <th>Guest Name</th>
                <th>Number of Guests</th>
                <th>Arrived At</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="table" items="${otherTables}">
                <tr>
                    <td><c:out value="${table.guestName}" /></td>
                    <td><c:out value="${table.numberOfGuests}" /></td>
                    <td><c:out value="${table.createdAt}" /></td>
                    <td>
                        <form id="takeBackForm" action="/tables/takeback/${table.id}" method="post">
                            <input type="hidden" name="_method" value="PUT">
                            <button type="submit" class="btn btn-success">Pick up table</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <p><a href="/home" class="btn btn-primary">Back to Dashboard</a></p>
</div>

</body>
</html>
