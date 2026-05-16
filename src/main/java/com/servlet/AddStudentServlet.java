package com.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class AddStudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {

        int id = Integer.parseInt(
        request.getParameter("studentID"));

        String name = request.getParameter("studentName");

        String room = request.getParameter("roomNumber");

        String date = request.getParameter("admissionDate");

        double paid = Double.parseDouble(
        request.getParameter("feesPaid"));

        double pending = Double.parseDouble(
        request.getParameter("pendingFees"));

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/hosteldb",
            "root",
            "root");

            PreparedStatement ps = con.prepareStatement(
            "insert into HostelStudents values(?,?,?,?,?,?)");

            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setString(3,room);
            ps.setString(4,date);
            ps.setDouble(5,paid);
            ps.setDouble(6,pending);

            ps.executeUpdate();

            response.getWriter().println(
            "Student Added Successfully");

            con.close();

        } catch(Exception e) {

            e.printStackTrace();
        }
    }
}