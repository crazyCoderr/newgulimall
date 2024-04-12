package com.atguigu.newgulimall.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.newgulimall.common.utils.PageUtils;
import com.atguigu.newgulimall.gulimallproduct.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author hesonglin
 * @email 709270121@qq.com
 * @date 2024-04-12 10:09:02
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

