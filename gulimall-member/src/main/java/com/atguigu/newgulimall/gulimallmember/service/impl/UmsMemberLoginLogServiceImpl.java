package com.atguigu.newgulimall.gulimallmember.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.newgulimall.common.utils.PageUtils;
import com.atguigu.newgulimall.common.utils.Query;

import com.atguigu.newgulimall.gulimallmember.dao.UmsMemberLoginLogDao;
import com.atguigu.newgulimall.gulimallmember.entity.UmsMemberLoginLogEntity;
import com.atguigu.newgulimall.gulimallmember.service.UmsMemberLoginLogService;


@Service("umsMemberLoginLogService")
public class UmsMemberLoginLogServiceImpl extends ServiceImpl<UmsMemberLoginLogDao, UmsMemberLoginLogEntity> implements UmsMemberLoginLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsMemberLoginLogEntity> page = this.page(
                new Query<UmsMemberLoginLogEntity>().getPage(params),
                new QueryWrapper<UmsMemberLoginLogEntity>()
        );

        return new PageUtils(page);
    }

}