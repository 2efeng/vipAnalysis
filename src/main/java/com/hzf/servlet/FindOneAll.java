package com.hzf.servlet;

import com.hzf.bean.User;
import com.hzf.database.AllMethod;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class FindOneAll extends HttpServlet {
    private static final long serialVersionUID = 1L;


    public FindOneAll() {
        super();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //防止出现乱码
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        //这里是百度到的强转代码，用第二种方式会报错
        int id = Integer.parseInt(request.getParameter("id"));
        //int id = request.getParameter("id");

        AllMethod findoneall = new AllMethod();//实例化一个所有方法的对象
        //调用 findoneall方法通过ID获得刚刚找到的相关值
        User user = findoneall.findOneAll(id);
        request.setAttribute("id", user.getId());
        request.setAttribute("username", user.getUsername());
        request.setAttribute("passwd", user.getPassword());
        request.setAttribute("time", user.getTime());
        request.setAttribute("beizhu", user.getRemarks());

        RequestDispatcher going = request.getRequestDispatcher("admin/up.jsp");
        going.forward(request, response);


    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

}
