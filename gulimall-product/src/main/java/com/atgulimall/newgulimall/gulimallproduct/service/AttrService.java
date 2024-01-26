package com.atgulimall.newgulimall.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atgulimall.newgulimall.common.utils.PageUtils;
import com.atgulimall.newgulimall.gulimallproduct.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author hesonglin
 * @email 709270121@qq.com
 * @date 2024-01-25 15:37:24
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

