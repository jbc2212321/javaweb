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

@WebServlet("/edit")
public class ChangguanServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("POST");
        HttpSession session = (HttpSession) req.getSession();
        String count = req.getParameter("count");
        String cgName= req.getParameter("cgName");
        String phone= req.getParameter("phone");
        String userName= req.getParameter("userName");
        String address= req.getParameter("address");
        String descAddress= req.getParameter("descAddress");
        String desc= req.getParameter("desc");
        List<Changguan>changguans =new ArrayList<Changguan>();
        Changguan changguan=new Changguan(Integer.parseInt(count),cgName,phone,userName,address,descAddress);
        System.out.println(changguan);
        changguans= (List<Changguan>) session.getAttribute("cglist");
        changguans=ChangguanMgr.edit(changguans,Integer.parseInt(count),changguan);
        session.removeAttribute("cglist");
        session.setAttribute("cglist",changguans);
        resp.sendRedirect("/s3/changguanlist.jsp");
    }
}
