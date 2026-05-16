package com.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class UpdateStudentServlet extends HttpServlet {

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
            "update HostelStudents set StudentName=?, RoomNumber=?, AdmissionDate=?, FeesPaid=?, PendingFees=? where StudentID=?");

            ps.setString(1,name);
            ps.setString(2,room);
            ps.setString(3,date);
            ps.setDouble(4,paid);
            ps.setDouble(5,pending);
            ps.setInt(6,id);

            ps.executeUpdate();

            response.getWriter().println(
            "Student Updated Successfully");

            con.close();

        } catch(Exception e) {

            e.printStackTrace();
        }
    }
}