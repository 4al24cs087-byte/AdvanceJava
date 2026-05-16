package com.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class DeleteStudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {

        int id = Integer.parseInt(
        request.getParameter("studentID"));

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/hosteldb",
            "root",
            "root");

            PreparedStatement ps = con.prepareStatement(
            "delete from HostelStudents where StudentID=?");

            ps.setInt(1,id);

            ps.executeUpdate();

            response.getWriter().println(
            "Student Deleted Successfully");

            con.close();

        } catch(Exception e) {

            e.printStackTrace();
        }
    }
}