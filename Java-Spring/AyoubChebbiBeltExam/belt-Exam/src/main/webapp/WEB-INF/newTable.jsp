<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create New Table</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
    .logout-btn {
        position: absolute;
        top: 10px;
        right: 10px;
    }
    form {
        max-width: 500px;
        margin: auto;
    }
    label {
        margin-bottom: 5px;
    }
    input[type="text"],
    input[type="number"],
    textarea {
        width: 100%;
        padding: 8px;
        margin-bottom: 10px;
        box-sizing: border-box;
    }
    input[type="submit"] {
        background-color: #4CAF50;
        color: white;
        padding: 10px 20px;
        border: none;
        cursor: pointer;
    }
    input[type="submit"]:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>

<div class="container mt-3">
    <h2>Create New Table</h2>
    <button class="btn btn-primary logout-btn" onclick="window.location.href='/logout'">Logout</button>
    <form action="/tables/new" method="post">
        <div class="form-group">
            <label for="guestName">Guest Name:</label>
            <input type="text" id="guestName" name="guestName" class="form-control" required/>
        </div>
        <div class="form-group">
            <label for="numberOfGuests">Number of Guests:</label>
            <input type="number" id="numberOfGuests" name="numberOfGuests" class="form-control" required/>
        </div>
        <div class="form-group">
            <label for="notes">Notes:</label>
            <textarea id="notes" name="notes" class="form-control"></textarea>
        </div>
        <div>
            <input type="submit" value="Create" class="btn btn-success"/>
        </div>
    </form>
</div>

</body>
</html>
