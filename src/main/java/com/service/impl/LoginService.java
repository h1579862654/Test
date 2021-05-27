package com.service.impl;

import com.mapper.LoginMapper;
import com.pojo.User;
import com.service.Ilogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ssm20
 * @description:
 * @author: SANJIU HUANG
 * @create: 2021-05-27 09:49
 **/
@Service
public class LoginService implements Ilogin {
    @Autowired
    LoginMapper lm;
    public List<User> getAllUser() {
        System.out.println("LoginService->getAllUser");
        List<User> allUser = lm.getAllUser();
        return  allUser;
    }
}
