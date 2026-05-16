<!DOCTYPE html>
<html>
<head>
<title>Update Student</title>

<style>

body{
    font-family: Arial;
    background: linear-gradient(to right,#ff9966,#ff5e62);
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
    background:green;
    color:white;
    border:none;
}

</style>
</head>

<body>

<div class="container">

<h2>Update Student</h2>

<form action="UpdateStudentServlet" method="post">

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

<button type="submit">Update Student</button>

</form>

</div>

</body>
</html>