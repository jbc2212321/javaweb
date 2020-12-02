package servlet;

import com.alibaba.fastjson.JSONArray;

import javax.servlet.ServletContext;
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
public class add extends HttpServlet {
    static {
        int count=0;
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String type = req.getParameter("type");
        String semester = req.getParameter("semester");
        String desc = req.getParameter("desc");
        HttpSession session = req.getSession();
        User user =new User(id,name,type,semester,desc);

        List<User>userList=new ArrayList<User>();
        if (session.getAttribute("user")==null){
            userList.add(user);

        }else {
            userList= (List<User>) session.getAttribute("user");
            userList.add(user);
            session.removeAttribute("user");

        }
        session.setAttribute("user",userList);
        JSONArray jsonArray2 = (JSONArray) JSONArray.toJSON(userList);
        System.out.println(jsonArray2);
        resp.getWriter().println(jsonArray2);

    }
}
