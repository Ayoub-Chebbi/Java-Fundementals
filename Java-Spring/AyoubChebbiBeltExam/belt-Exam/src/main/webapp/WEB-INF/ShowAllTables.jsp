<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Reading Books</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        h1 {
            text-align: center;
            margin-top: 20px;
        }

        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
            background-color: #fff;
        }

        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #f2f2f2;
        }

        a {
            display: block;
            width: 100px;
            text-align: center;
            margin: 20px auto;
            padding: 10px;
            background-color: #007bff;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
        }

        a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h1>All Tables</h1>
    <table border='2'>
        <thead>
            <tr>
                <th>Guest Name</th>
                <th>Number of Guests</th>
                <th>Arrived at</th>
                <th>Server</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="table" items="${tableMasters}">
                <tr>
                    <td><c:out value="${table.guestName}"/></td>
                    <td><c:out value="${table.numberOfGuests}"/></td>
                    <td><c:out value="${table.createdAt}"/></td>
                    <td><c:out value="${table.user.username}"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/home">Home</a>
</body>
</html>
