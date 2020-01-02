package com.wxs.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RhymeUser {

    private String userName;

    private String password;

    private Long phone;
}
