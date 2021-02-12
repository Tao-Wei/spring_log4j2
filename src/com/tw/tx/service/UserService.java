package com.tw.tx.service;

/**
 * @author TaoWei
 * @date 2021/2/12-11:44
 **/
public interface UserService {
    boolean transfer(Integer sourceId, Integer destId, Integer money) throws Exception;
}
