package com.pojo;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Date;

/**
 * @program: ssm20
 * @description:
 * @author: SANJIU HUANG
 * @create: 2021-05-27 09:42
 **/
public class User {
    private  int id;
    private String  name;
    private String phone ;
    private String emall ;
    private  int sid ;
    private  int balance ;
    private String account ;
    private String pass;
    private Date da;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", emall='" + emall + '\'' +
                ", sid=" + sid +
                ", balance=" + balance +
                ", account='" + account + '\'' +
                ", pass='" + pass + '\'' +
                ", da=" + da +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmall() {
        return emall;
    }

    public void setEmall(String emall) {
        this.emall = emall;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Date getDa() {
        return da;
    }

    public void setDa(Date da) {
        this.da = da;
    }
}
