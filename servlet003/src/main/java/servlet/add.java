package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/add")
public class add extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session =(HttpSession) req.getSession();
        List<Changguan>changguanList =new ArrayList<Changguan>();
        Changguan changguan0 =new Changguan(1,"湖大凤凰馆","边耐政老师","138","湖南省长沙市岳麓区","111");
        Changguan changguan1 =new Changguan(2,"湖大凤凰馆","边耐政老师","138","湖南省长沙市岳麓区","111");
        Changguan changguan2 =new Changguan(3,"湖大凤凰馆","边耐政老师","138","湖南省长沙市岳麓区","111");
        Changguan changguan3 =new Changguan(4,"湖大凤凰馆","边耐政老师","138","湖南省长沙市岳麓区","111");
        Changguan changguan4 =new Changguan(5,"湖大凤凰馆","边耐政老师","138","湖南省长沙市岳麓区","111");
        changguanList.add(changguan0);
        changguanList.add(changguan1);
        changguanList.add(changguan2);
        changguanList.add(changguan3);
        changguanList.add(changguan4);
        session.setAttribute("cglist",changguanList);
        resp.sendRedirect("/s3/changguanlist.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
