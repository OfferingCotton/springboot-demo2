package org.example.service;

import org.example.entrity.User;

import java.util.List;

/**
 * @interface: UserService
 * @description:
 * @author: sh.Liu
 * @date: 2022-01-17 13:56
 */
public interface UserService {
    /**
     * 根据id查询
     * @param id
     * @return
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