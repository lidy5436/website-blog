package com.example.blog.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.base.core.api.R;
import com.example.base.mybatis.Query;
import com.example.blog.entity.User;
import com.example.blog.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户信息接口
 */
@RestController
@RequestMapping("/base/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 查询分页
     */
    @GetMapping("/page")
    public R page(Query query, User user) {
        IPage<User> page = new Page<>(query.getCurrent(), query.getSize());
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>(user);
        queryWrapper.orderByDesc(User::getCreateTime);
        IPage<User> result = userService.page(page, queryWrapper);
        return R.data(result);
    }

    /**
     * 查询列表
     */
    @GetMapping("/list")
    public R<List<User>> list(User user) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>(user);
        List<User> list = userService.list(queryWrapper);
        return R.data(list);
    }


    /**
     * 查询详情
     */
    @GetMapping("/detail")
    public R<User> detail(@Param("id") Long id) {
        User user = userService.getById(id);
        return R.data(user);
    }

    /**
     * 新增数据
     */
    @PostMapping("/add")
    public R<Boolean> add(@RequestBody User user) {
        user.setPassword("123456");
        boolean status = userService.save(user);
        return R.status(status);
    }

    /**
     * 更新数据
     */
    @PutMapping("/edit")
    public R<Boolean> update(@RequestBody User user) {
        boolean status = userService.updateById(user);
        return R.status(status);
    }

    /**
     * 删除数据
     */
    @GetMapping("/remove")
    public R<Boolean> remove(@Param("ids") String ids) {
        boolean status = userService.removeById(ids);
        return R.status(status);
    }


}
