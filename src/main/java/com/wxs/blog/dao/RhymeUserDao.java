package com.wxs.blog.dao;


import com.wxs.blog.entity.RhymeUser;
import org.springframework.stereotype.Repository;

@Repository
public interface RhymeUserDao extends MyMapper<RhymeUser> {
    RhymeUser findUserByPhone(String phone, String password);
}
