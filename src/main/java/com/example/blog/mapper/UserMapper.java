package com.example.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.blog.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
* 用户信息表
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
