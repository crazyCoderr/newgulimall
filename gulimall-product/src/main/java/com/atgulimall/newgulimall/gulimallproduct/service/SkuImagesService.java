package com.atgulimall.newgulimall.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atgulimall.newgulimall.common.utils.PageUtils;
import com.atgulimall.newgulimall.gulimallproduct.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author hesonglin
 * @email 709270121@qq.com
 * @date 2024-01-25 15:36:37
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

