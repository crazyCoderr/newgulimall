package com.atgulimall.newgulimall.gulimallproduct.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atgulimall.newgulimall.common.utils.PageUtils;
import com.atgulimall.newgulimall.common.utils.Query;

import com.atgulimall.newgulimall.gulimallproduct.dao.BrandDao;
import com.atgulimall.newgulimall.gulimallproduct.entity.BrandEntity;
import com.atgulimall.newgulimall.gulimallproduct.service.BrandService;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BrandEntity> page = this.page(
                new Query<BrandEntity>().getPage(params),
                new QueryWrapper<BrandEntity>()
        );

        return new PageUtils(page);
    }

}