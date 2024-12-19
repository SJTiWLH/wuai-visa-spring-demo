package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.pojo.TbTodolist;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TodolistMapper extends BaseMapper<TbTodolist> {
}
