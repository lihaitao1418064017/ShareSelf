package com.share.im.entity;



/**
 * Description:消息
 *
 * @Author lht
 * @Date 2018/11/26 下午9:49
 **/

public class Message {
    /**
     * 主键
     */
    private String msgId;
    /**
     *来源id
     */
    private String from;
    /**
     *目标id
     */
    private String to;
    /**
     *命令码
     */
    private int cmd;

    /**
     *创建时间
     */
    private Long createTime;
    /**
     *消息类型
     */
    private int msgType;
    /**
     *聊天类型
     */
    private int chatType;
    /**
     *群主键
     */
    private String groupId;

    /**
     *内容
     */
    private String content;
    /**
     *扩展字段
     */
    private String extras;
}
