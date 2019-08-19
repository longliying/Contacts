package com.lly.Contacts;

import com.lly.Dao.IContacts;
import com.lly.Dao.implement.IpementDao;
import com.lly.entity.ContactsUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ContactsServlet",urlPatterns = "/ContactsServlet")
public class ContactsServlet extends javax.servlet.http.HttpServlet {
    IContacts implement = new IpementDao();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String action = request.getParameter("action");
        switch (action){
            //登录
            case "login":
                login(request,response);
                break;
            case "showMyContacts":
                showMyContacts(request,response);
                default:
                    break;
        }

    }
//展示联系人信息
    private void showMyContacts(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<ContactsUser> list = implement.getLinkman();
        request.setAttribute("list",list);
        request.getRequestDispatcher("showMyContacts.jsp").forward(request,response);

    }
//登录
    private void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //业务处理
        //判断用户密码是否正确
        Integer count = implement.checkUsername(username, password);
        if(count>0){
            response.sendRedirect("welcome.jsp");
        }
        else {
            request.setAttribute("msg", "输入的用户或密码不正确");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

}
