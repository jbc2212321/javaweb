package dao;

import pojo.User;

import java.util.List;

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
}
