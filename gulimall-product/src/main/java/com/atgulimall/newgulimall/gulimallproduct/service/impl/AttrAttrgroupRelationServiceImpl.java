package com.atgulimall.newgulimall.gulimallproduct.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atgulimall.newgulimall.common.utils.PageUtils;
import com.atgulimall.newgulimall.common.utils.Query;

import com.atgulimall.newgulimall.gulimallproduct.dao.AttrAttrgroupRelationDao;
import com.atgulimall.newgulimall.gulimallproduct.entity.AttrAttrgroupRelationEntity;
import com.atgulimall.newgulimall.gulimallproduct.service.AttrAttrgroupRelationService;


@Service("attrAttrgroupRelationService")
public class AttrAttrgroupRelationServiceImpl extends ServiceImpl<AttrAttrgroupRelationDao, AttrAttrgroupRelationEntity> implements AttrAttrgroupRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrAttrgroupRelationEntity> page = this.page(
                new Query<AttrAttrgroupRelationEntity>().getPage(params),
                new QueryWrapper<AttrAttrgroupRelationEntity>()
        );

        return new PageUtils(page);
    }

}