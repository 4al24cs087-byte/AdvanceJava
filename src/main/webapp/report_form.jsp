<!DOCTYPE html>
<html>
<head>
<title>Report Form</title>

<style>

body{
    font-family: Arial;
    background: linear-gradient(to right,#4facfe,#00f2fe);
}

.container{
    width:40%;
    margin:auto;
    background:white;
    margin-top:50px;
    padding:30px;
    border-radius:10px;
}

input,select{
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

<h2>Generate Report</h2>

<form action="ReportCriteriaServlet" method="post">

<select name="reportType">

<option value="room">
Students By Room
</option>

<option value="date">
Students By Date Range
</option>

</select>

Room Number:
<input type="text" name="roomNumber">

From Date:
<input type="date" name="fromDate">

To Date:
<input type="date" name="toDate">

<button type="submit">
Generate Report
</button>

</form>

</div>

</body>
</html>