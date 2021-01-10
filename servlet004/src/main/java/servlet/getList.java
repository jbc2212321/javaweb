package servlet;


import dao.UserMapper;
import net.sf.json.JSONArray;
import org.apache.ibatis.session.SqlSession;
import utils.MybatisUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

@WebServlet("/getList")
public class getList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GET");

        resp.setContentType("application/json; charset=utf-8");
        resp.setHeader("cache-control", "no-cache");
        PrintWriter out = resp.getWriter();

        ServletContext context =this.getServletContext();
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<Map<Object, Object>>mapList=userMapper.getAll();
        sqlSession.close();
        //2.将list转换为json格式
//        String json = JSONArray.fromObject(mapList).toString();
        //3.设置json的编码格式并且将json发送给浏览器


        out.print(mapList);
//        resp.getWriter().print(jSONObject);
    }
}
