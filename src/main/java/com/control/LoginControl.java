package com.control;

import com.pojo.User;
import com.service.Ilogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: ssm20
 * @description:
 * @author: SANJIU HUANG
 * @create: 2021-05-27 09:40
 **/
@Controller
public class LoginControl {
    @Autowired
    Ilogin ig;
    @RequestMapping("lg")
    public String login(User u){
        System.out.println(u);
        List<User> allUser = ig.getAllUser();
        for (User u1:allUser) {
            System.out.println(u1);

        }
        return "index.jsp";
    }
}
