package com.wxs.blog.dao;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/*
*  所有dao继承MyMapper
*  */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
