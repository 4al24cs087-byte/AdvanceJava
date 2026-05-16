<!DOCTYPE html>
<html>
<head>
<title>Add Student</title>

<style>

body{
    font-family: Arial;
    background: linear-gradient(to right,#36d1dc,#5b86e5);
}

.container{
    width:40%;
    margin:auto;
    background:white;
    margin-top:50px;
    padding:30px;
    border-radius:10px;
}

input{
    width:100%;
    padding:10px;
    margin-top:10px;
}

button{
    width:100%;
    padding:12px;
    margin-top:15px;
    background:#007bff;
    color:white;
    border:none;
}

</style>
</head>

<body>

<div class="container">

<h2>Add Student</h2>

<form action="AddStudentServlet" method="post">

Student ID:
<input type="number" name="studentID">

Student Name:
<input type="text" name="studentName">

Room Number:
<input type="text" name="roomNumber">

Admission Date:
<input type="date" name="admissionDate">

Fees Paid:
<input type="text" name="feesPaid">

Pending Fees:
<input type="text" name="pendingFees">

<button type="submit">Add Student</button>

</form>

</div>

</body>
</html>