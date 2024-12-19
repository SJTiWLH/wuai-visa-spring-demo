package com.example.demo.controller;

import com.example.demo.pojo.TbTodolist;
import com.example.demo.service.TodolistService;
import com.example.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/todolist")
public class TodolistController {

    @Autowired
    private TodolistService todolistService;

    @PostMapping("/add")
    public Result<?> addlist(@RequestBody TbTodolist todolist){
        System.out.println("todolist = "+ todolist);
        boolean save = todolistService.save(todolist);
        if(save){
            return Result.ok(todolist);
        }
        return Result.fail();
//        return Result.ok();
    }
    @GetMapping("/getAll")
    public Result<?> getAllList(){
        System.out.println("getAllList");
        List<TbTodolist> todolistList = todolistService.list();
        return Result.ok(todolistList);

    }

}
