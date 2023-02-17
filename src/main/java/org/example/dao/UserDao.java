package org.example.dao;

import org.example.entrity.User;

import java.util.List;

/**
 * @interface: UserDao
 * @description:
 * @author: sh.Liu
 * @date: 2022-01-14 16:37
 */
public interface UserDao {
    /**
     * 根据id查询
     * @param id id
     * @return User
     */
    User getUserById(Integer id);

    /**
     * 查询所有用户
     * @return
     */
    List<User> listUser();

    /**
     * 保存用户
     * @param user
     * @return
     */
    int save(User user);

    /**
     * 更新用户
     * @param id
     * @param user
     * @return
     */
    int update(Integer id, User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int delete(Integer id);


}