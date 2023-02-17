package org.example.controller;


import org.example.config.Result;
import org.example.service.UserService;
import org.example.entrity.User;
import org.springframework.web.bind.annotation.*;
import org.example.exception.BizException;

/**
 * @className: JdbcController
 * @description:
 * @author: sh.Liu
 * @date: 2022-01-17 13:58
 */
@RestController
@RequestMapping("jdbc")
public class JdbcController {

    /**
     * 这是构造方法注入，相当于 @autowired
     */
    private final UserService userService;

    public JdbcController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("save")
    public Result save(@RequestBody User user){
        userService.save(user);
        return Result.success();
    }

    @PostMapping("update")
    public Result update(@RequestBody User user){
        if (user.getId() == null) {
            throw new BizException("更新操作id不能为空");
        }
        userService.update(user.getId(), user);
        return Result.success();
    }

    @GetMapping("get/{id}")
    public Result getById(@PathVariable Integer id){
        return Result.success(userService.getUserById(id));
    }

    @GetMapping("list")
    public Result list(){
        return Result.success(userService.listUser());
    }

    @GetMapping("delete/{id}")
    public Result delete(@PathVariable Integer id){
        userService.delete(id);
        return Result.success();
    }
}