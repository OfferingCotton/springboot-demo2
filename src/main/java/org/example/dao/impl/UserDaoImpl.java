package org.example.dao.impl;


import org.example.dao.UserDao;
import org.example.entrity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Date;

/**
 * @className: UserDaoImpl
 * @description:
 * @author: sh.Liu
 * @date: 2022-01-14 16:40
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public User getUserById(Integer id) {
        User user = jdbcTemplate.queryForObject("select * from t_user where id = ?", new BeanPropertyRowMapper<User>(User.class), id);

        return user;
    }

    @Override
    public List<User> listUser() {
        List<User> users = jdbcTemplate.query("select * from t_user", new BeanPropertyRowMapper<User>(User.class));
        return users;
    }

    @Override
    public int save(User user) {
        return jdbcTemplate.update("insert into t_user(name, age, address, create_time, update_time) values(?, ?, ?,?,?)",
                user.getName(), user.getAge(), user.getAddress(), new Date(), new Date());
    }

    @Override
    public int update(Integer id, User user) {
        return jdbcTemplate.update("UPDATE t_user SET name = ? , age = ? ,address = ? ,update_time = ? WHERE id=?",
                user.getName(), user.getAge(), user.getAddress(), new Date(), id);
    }

    @Override
    public int delete(Integer id) {
        return jdbcTemplate.update("DELETE from tb_user where id = ? ", id);
    }
}
