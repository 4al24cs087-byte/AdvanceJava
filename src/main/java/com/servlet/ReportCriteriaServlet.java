package com.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ReportCriteriaServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {

        String type = request.getParameter("reportType");

        response.getWriter().println(
        "Report Generated For : " + type);
    }
}