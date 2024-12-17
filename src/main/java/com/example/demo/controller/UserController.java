package com.example.demo.controller;

import com.example.demo.pojo.TbUser;
import com.example.demo.service.UserService;
import com.example.demo.service.impl.UserServiceImpl;
import com.example.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public Result<?> getUser(@RequestBody TbUser user) {
        System.out.println("user = " + user);
        boolean save = userService.save(user);

        if (save)
            return Result.ok();
        return Result.fail();
    }

    @GetMapping("/get/{email}")
    public Result<?> getUserByEmail(@PathVariable String email) {
        TbUser user = userService.getUserByEmail(email);
        return Result.ok(user);
    }

    @GetMapping("/delete/{id}")
    public Result<?> deleteUserById(@PathVariable Integer id) {
        userService.removeById(id);
        return Result.ok();
    }

}
