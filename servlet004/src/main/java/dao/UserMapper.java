package dao;

import org.apache.ibatis.annotations.Param;
import pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();

    //根据id查询用户
    User getUserByID(int id);

    //增加一个用户
    void addUser(User user);

    //更新用户
    void updateUser(User user);

    //删除用户
    void deleteUserById(int id);

    List<Map<Object, Object>>getAll();

    void delete(@Param("id")String id);



}
