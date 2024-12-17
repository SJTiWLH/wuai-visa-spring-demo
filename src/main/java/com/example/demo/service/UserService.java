package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.pojo.TbUser;

public interface UserService extends IService<TbUser> {
    TbUser getUserByEmail(String email);
}
