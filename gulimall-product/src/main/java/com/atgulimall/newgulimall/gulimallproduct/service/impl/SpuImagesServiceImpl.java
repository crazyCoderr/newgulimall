package com.atgulimall.newgulimall.gulimallproduct.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atgulimall.newgulimall.common.utils.PageUtils;
import com.atgulimall.newgulimall.common.utils.Query;

import com.atgulimall.newgulimall.gulimallproduct.dao.SpuImagesDao;
import com.atgulimall.newgulimall.gulimallproduct.entity.SpuImagesEntity;
import com.atgulimall.newgulimall.gulimallproduct.service.SpuImagesService;


@Service("spuImagesService")
public class SpuImagesServiceImpl extends ServiceImpl<SpuImagesDao, SpuImagesEntity> implements SpuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuImagesEntity> page = this.page(
                new Query<SpuImagesEntity>().getPage(params),
                new QueryWrapper<SpuImagesEntity>()
        );

        return new PageUtils(page);
    }

}