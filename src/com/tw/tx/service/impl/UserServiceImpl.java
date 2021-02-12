package com.tw.tx.service.impl;

import com.tw.tx.dao.UserDao;
import com.tw.tx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author TaoWei
 * @date 2021/2/12-11:48
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public boolean transfer(Integer sourceId, Integer destId, Integer money) {
        userDao.reduceMoney(sourceId, money);
        int i=1/0;
        userDao.addMoney(destId, money);
        return true;
    }
}
