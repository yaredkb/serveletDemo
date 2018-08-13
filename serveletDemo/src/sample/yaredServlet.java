package sample;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.io.PrintWriter;

import static java.lang.System.out;

@WebServlet(name = "yaredServlet",urlPatterns ={"/test"})
public class yaredServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>This is the test for servlets</h1>");
        out.flush();
    }
}
