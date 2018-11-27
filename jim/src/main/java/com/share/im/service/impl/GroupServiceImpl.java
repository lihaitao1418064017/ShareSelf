package com.share.im.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.share.im.domain.Group;
import com.share.im.mapper.GroupMapper;
import com.share.im.service.GroupService;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @Author lht
 * @Date 2018/11/27 下午10:10
 **/
@Service
public class GroupServiceImpl extends ServiceImpl<GroupMapper, Group> implements GroupService {
}
