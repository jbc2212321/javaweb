package servlet;

import dao.UserMapper;
import org.apache.ibatis.session.SqlSession;
import pojo.User;
import utils.MybatisUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/summit")
public class first extends HttpServlet {
//    SqlSession sqlSession = MybatisUtils.getSqlSession();
//    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user=userMapper.getUserByID(1);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(user);
        resp.getWriter().println(user);
        resp.getWriter().println("nmd,wsm");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
