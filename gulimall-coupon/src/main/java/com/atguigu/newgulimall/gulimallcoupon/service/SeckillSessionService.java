package com.atguigu.newgulimall.gulimallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.newgulimall.common.utils.PageUtils;
import com.atguigu.newgulimall.gulimallcoupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author hesonglin
 * @email 709270121@qq.com
 * @date 2024-04-12 15:40:05
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

