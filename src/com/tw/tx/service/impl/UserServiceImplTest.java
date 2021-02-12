package com.tw.tx.service.impl;

import com.tw.tx.config.TxConfig;
import com.tw.tx.service.UserService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author TaoWei
 * @date 2021/2/12-12:26
 **/
class UserServiceImplTest {

    @Test
    void transfer() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService= context.getBean("userServiceImpl", UserService.class);
        try {
            userService.transfer(1, 2, 100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void logTest(){
        Logger logger = LoggerFactory.getLogger(UserServiceImplTest.class);
        logger.info("hello");
    }
}
