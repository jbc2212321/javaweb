package com.servlet;

import com.alibaba.fastjson.JSONArray;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/util")
public class util extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = this.getServletContext();
        String[]a=new String[3];
        a[0]="nmd";
        a[1]="wsl";
        a[2]="你妈的，我傻了";
        JSONArray jsonArray2 = (JSONArray) JSONArray.toJSON(a);
        resp.getWriter().println(jsonArray2);
//        context.getRequestDispatcher("/login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
