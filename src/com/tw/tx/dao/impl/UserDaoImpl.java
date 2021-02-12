package com.tw.tx.dao.impl;

import com.tw.tx.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author TaoWei
 * @date 2021/2/12-11:50
 **/
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addMoney(Integer account, Integer money) {
        return jdbcTemplate.update("UPDATE user SET balance=balance+? WHERE account=?", money, account);
    }

    @Override
    public int reduceMoney(Integer account, Integer money) {
        return jdbcTemplate.update("UPDATE user SET balance=balance-? WHERE account=?", money, account);
    }
}
