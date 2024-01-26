package com.atgulimall.newgulimall.gulimallproduct.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atgulimall.newgulimall.common.utils.PageUtils;
import com.atgulimall.newgulimall.common.utils.Query;

import com.atgulimall.newgulimall.gulimallproduct.dao.SkuInfoDao;
import com.atgulimall.newgulimall.gulimallproduct.entity.SkuInfoEntity;
import com.atgulimall.newgulimall.gulimallproduct.service.SkuInfoService;


@Service("skuInfoService")
public class SkuInfoServiceImpl extends ServiceImpl<SkuInfoDao, SkuInfoEntity> implements SkuInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuInfoEntity> page = this.page(
                new Query<SkuInfoEntity>().getPage(params),
                new QueryWrapper<SkuInfoEntity>()
        );

        return new PageUtils(page);
    }

}