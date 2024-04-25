<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        .logout-btn {
            position: absolute;
            top: 10px;
            right: 10px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
        }
        .action-link {
            text-decoration: none;
            color: blue;
            margin-right: 10px;
        }
    </style>
</head>
<body>

<div class="container mt-3">
    <h1>Welcome back, <c:out value="${user.username}" />!</h1>
    <button class="btn btn-primary logout-btn" onclick="window.location.href='/logout'">Logout</button>
    <p>Your Tables</p>
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
            <c:forEach var="table" items="${serverTables}">
                <tr>
                    <td><c:out value="${table.guestName}" /></td>
                    <td><c:out value="${table.numberOfGuests}" /></td>
                    <td><c:out value="${table.createdAt}" /></td>
                    <td>
                        <form id="deleteForm" action="/tables/delete/${table.id}" method="post">
                            <input type="hidden" name="_method" value="DELETE">
                            <button type="submit" class="btn btn-danger">finished</button>
                        </form>
					<form id="giveUpForm" action="/tables/${table.id}/give-up" method="post">
					    <button type="submit" class="btn btn-warning">Give Up</button>
					</form>
                        
                        <a href="/tables/${table.id}/edit" class="btn btn-primary">Edit</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <form action="/tables/giveup/{id}">
    <input type="hidden" />
    </form>
    <p><a href="/tables/new" class="btn btn-success">New Table</a></p>
    <p><a href="/tables" class="btn btn-info">See Other Tables</a></p>
</div>

</body>
</html>
