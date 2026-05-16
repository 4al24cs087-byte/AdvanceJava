<!DOCTYPE html>
<html>
<head>
<title>Hostel Management System</title>

<style>

body{
    font-family: Arial;
    background: linear-gradient(to right,#4facfe,#00f2fe);
    text-align:center;
}

.container{
    width:50%;
    margin:auto;
    margin-top:60px;
    background:white;
    padding:30px;
    border-radius:10px;
    box-shadow:0px 0px 10px gray;
}

a{
    display:block;
    text-decoration:none;
    background:#007bff;
    color:white;
    padding:15px;
    margin:10px;
    border-radius:5px;
}

a:hover{
    background:#0056b3;
}

</style>
</head>

<body>

<div class="container">

<h1>Hostel Management System</h1>

<a href="studentadd.jsp">Add Student</a>

<a href="studentupdate.jsp">Update Student</a>

<a href="studentdelete.jsp">Delete Student</a>

<a href="DisplayStudentsServlet">Display Students</a>

<a href="reports.jsp">Reports</a>

</div>

</body>
</html>