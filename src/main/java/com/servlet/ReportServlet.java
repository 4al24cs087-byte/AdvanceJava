package com.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ReportServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/hosteldb",
            "root",
            "root");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
            "select * from HostelStudents where PendingFees>0");

            out.println("<h2>Students With Pending Fees</h2>");

            out.println("<table border='1'>");

            while(rs.next()) {

                out.println("<tr>");

                out.println("<td>"+rs.getInt(1)+"</td>");

                out.println("<td>"+rs.getString(2)+"</td>");

                out.println("<td>"+rs.getDouble(6)+"</td>");

                out.println("</tr>");
            }

            out.println("</table>");

            con.close();

        } catch(Exception e) {

            e.printStackTrace();
        }
    }
}