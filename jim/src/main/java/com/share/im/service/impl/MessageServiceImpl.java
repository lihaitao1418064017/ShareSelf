package com.share.im.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.share.im.domain.Message;
import com.share.im.mapper.MessageMapper;
import com.share.im.service.MessageService;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @Author lht
 * @Date 2018/11/27 下午10:10
 **/
@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements MessageService {
}
