package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.TbUser;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, TbUser> implements UserService {
    @Override
    public TbUser getUserByEmail(String email) {
        LambdaQueryWrapper<TbUser> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(TbUser::getEmail, email);
        wrapper.ne(TbUser::getUserId, 1);
        wrapper.last("limit 1");
        // select * from tb_user where email = ?
        return getOne(wrapper);
    }
}
