package com.wxs.blog.server;

import com.wxs.blog.entity.RhymeUser;

public interface RhymeLoginServer {
    RhymeUser findUserTologin(String phone, String password);
}
