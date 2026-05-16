<!DOCTYPE html>
<html>
<head>
<title>Delete Student</title>

<style>

body{
    font-family: Arial;
    background: linear-gradient(to right,#ee0979,#ff6a00);
}

.container{
    width:35%;
    margin:auto;
    background:white;
    margin-top:70px;
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
    background:red;
    color:white;
    border:none;
}

</style>
</head>

<body>

<div class="container">

<h2>Delete Student</h2>

<form action="DeleteStudentServlet" method="post">

Student ID:
<input type="number" name="studentID">

<button type="submit">Delete Student</button>

</form>

</div>

</body>
</html>