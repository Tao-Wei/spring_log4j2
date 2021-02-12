package com.tw.tx.dao;

/**
 * @author TaoWei
 * @date 2021/2/12-11:48
 **/
public interface UserDao {
    int addMoney(Integer account, Integer money);

    int reduceMoney(Integer account, Integer money);
}
