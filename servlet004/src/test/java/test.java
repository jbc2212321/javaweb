import dao.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import pojo.User;
import utils.MybatisUtils;

import java.util.List;
import java.util.Map;

public class test {

    public static void main(String[] args) {

    }

    @Test
    public void getUserTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.getUserByID(1));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void insertUserTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.addUser(new User(5,"好难啊","真不会"));
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //方式一，获取getMapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();
        for (User user:userList){
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testSelect(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserByID(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testAddUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.addUser(new User(4,"nmd","wsm"));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testUpdateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.updateUser(new User(4,"hh","ctm"));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testDeleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.deleteUserById(3);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void getAll(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<Map<Object, Object>>mapList=userMapper.getAll();
        for(Map<Object, Object>map:mapList){
            System.out.println(map);
        }
        sqlSession.commit();
        sqlSession.close();
    }


}
