package com.atguigu.newgulimall.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.newgulimall.common.utils.PageUtils;
import com.atguigu.newgulimall.gulimallproduct.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author hesonglin
 * @email 709270121@qq.com
 * @date 2024-04-12 10:09:02
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

