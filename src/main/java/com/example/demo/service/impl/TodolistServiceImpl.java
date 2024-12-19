package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.TodolistMapper;
import com.example.demo.pojo.TbTodolist;
import com.example.demo.service.TodolistService;
import org.springframework.stereotype.Service;

@Service
public class TodolistServiceImpl extends ServiceImpl<TodolistMapper, TbTodolist> implements TodolistService {
}
