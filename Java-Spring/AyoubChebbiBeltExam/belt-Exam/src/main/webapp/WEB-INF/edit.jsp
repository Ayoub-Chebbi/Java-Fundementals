<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>EDIT TABLE</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }

        .container {
            max-width: 600px;
            margin: 10vw auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }

        h2 {
            margin-top: 0;
        }

        form {
            margin-top: 20px;
        }

        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }

        input[type="text"],
        input[type="number"],
        textarea {
            width: calc(100% - 12px);
            padding: 6px;
            margin-bottom: 10px;
            border: 1px solid #ddd;
            border-radius: 3px;
            font-size: 14px;
        }

        input[type="submit"],
        button {
            padding: 8px 16px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }

        input[type="submit"]:hover,
        button:hover {
            background-color: #0056b3;
        }

        .logout-btn {
            position: absolute;
            top: 10px;
            right: 10px;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Edit Table</h2>
    <form:form action="/tables/${table.id}/update" method="post" modelAttribute="table">
        <div>
            <label for="guestName">Guest Name:</label>
            <form:errors path="guestName" class="text-danger"/>
            <form:input path="guestName" id="guestName"/>
        </div>
        <div>
            <label for="numberOfGuests">Number of Guests:</label>
            <form:errors path="numberOfGuests" class="text-danger"/>
            <form:input path="numberOfGuests" id="numberOfGuests"/>
        </div>
        <div>
            <label for="notes">Notes:</label>
            <form:errors path="notes" class="text-danger"/>
            <form:input path="notes" id="notes"/>
        </div>
        <input type="submit" value="Submit"/>
    </form:form>

    <form id="deleteForm" action="/tables/delete/${table.id}" method="post">
        <input type="hidden" name="_method" value="DELETE">
        <button type="submit">Delete</button>
    </form>

    <form id="logoutForm" action="/logout" method="post" class="logout-btn">
        <input type="submit" value="Logout"/>
    </form>
</div>

</body>
</html>
