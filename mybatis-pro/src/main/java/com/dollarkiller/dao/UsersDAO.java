package com.dollarkiller.dao;

import com.dollarkiller.entity.Users;
import com.dollarkiller.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-21
 * Time: 下午9:17
 * Description: No Description
 */
public class UsersDAO {
    private SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
    public List<Users> list;
    public List<Users> findAll() {
        try {
            list = sqlSession.selectList("findAll");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "this is UserDAO");
        }finally {
            sqlSession.close();
        }
        return list;
    }
}
