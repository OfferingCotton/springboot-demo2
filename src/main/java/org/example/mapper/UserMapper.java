package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.entrity.User;

/**
 * @author Trevor
 */
@Mapper
public interface UserMapper {
    /**
     * 删除操作
     *
     * @param id id
     * @return
     */
    int deleteByPrimaryKey(
            Integer id
    );

    /**
     * 插入操作
     *
     * @param record record
     * @return
     */
    int insert(
            User record
    );

    /**
     * 插如操作
     *
     * @param record record
     * @return
     */
    int insertSelective(
            User record
    );

    /**
     * 根据id查询操作
     *
     * @param id id
     * @return
     */
    User selectByPrimaryKey(
            Integer id
    );

    /**
     * 更新操作
     *
     * @param record record
     * @return
     */
    int updateByPrimaryKeySelective(
            User record
    );

    /**
     * 更新操作
     *
     * @param record record
     * @return
     */
    int updateByPrimaryKey(
            User record
    );
}