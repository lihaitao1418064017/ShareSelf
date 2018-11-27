package com.share.im.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.share.im.domain.User;
import com.share.im.mapper.UserMapper;
import com.share.im.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @Author lht
 * @Date 2018/11/27 下午10:10
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
