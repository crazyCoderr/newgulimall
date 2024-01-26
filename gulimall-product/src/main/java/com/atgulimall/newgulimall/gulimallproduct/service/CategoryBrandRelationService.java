package com.atgulimall.newgulimall.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atgulimall.newgulimall.common.utils.PageUtils;
import com.atgulimall.newgulimall.gulimallproduct.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author hesonglin
 * @email 709270121@qq.com
 * @date 2024-01-25 15:36:49
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

