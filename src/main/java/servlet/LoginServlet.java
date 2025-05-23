package servlet;

import model.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // Dummy check: admin/admin for secretary, prof/prof for professor, stud/stud
        // for student
        if ("admin".equals(username) && "admin".equals(password)) {
            req.getSession().setAttribute("role", "secretary");
            resp.sendRedirect("secretary.jsp");
        } else if ("prof".equals(username) && "prof".equals(password)) {
            req.getSession().setAttribute("role", "professor");
            resp.sendRedirect("professor.jsp");
        } else if ("stud".equals(username) && "stud".equals(password)) {
            req.getSession().setAttribute("role", "student");
            resp.sendRedirect("student.jsp");
        } else {
            resp.sendRedirect("login.jsp?error=1");
        }
    }
}