package com.share.im;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import javax.annotation.Resource;

/**
 * 注意这个类不能让 mp 扫描
 */
@Resource
public interface SuperMapper<T> extends BaseMapper<T> {

    // 这里可以放一些公共的方法
}
