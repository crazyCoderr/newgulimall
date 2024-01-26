package com.atgulimall.newgulimall.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atgulimall.newgulimall.common.utils.PageUtils;
import com.atgulimall.newgulimall.gulimallproduct.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author hesonglin
 * @email 709270121@qq.com
 * @date 2024-01-25 15:36:48
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

