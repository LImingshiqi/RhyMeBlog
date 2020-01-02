package com.wxs.blog.server.impl;

import com.wxs.blog.dao.RhymeUserDao;
import com.wxs.blog.entity.RhymeUser;
import com.wxs.blog.server.RhymeLoginServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RhymeLoginServerImpl implements RhymeLoginServer {

    @Autowired
    RhymeUserDao rhymeUserDao;

    @Override
    public RhymeUser findUserTologin(String phone, String password) {
        RhymeUser user = rhymeUserDao.findUserByPhone(phone, password);
        return user;
    }
}
