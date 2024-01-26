package com.atgulimall.newgulimall.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atgulimall.newgulimall.common.utils.PageUtils;
import com.atgulimall.newgulimall.gulimallproduct.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author hesonglin
 * @email 709270121@qq.com
 * @date 2024-01-25 15:37:21
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

