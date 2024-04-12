package com.atguigu.newgulimall.gulimallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.newgulimall.common.utils.PageUtils;
import com.atguigu.newgulimall.gulimallcoupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author hesonglin
 * @email 709270121@qq.com
 * @date 2024-04-12 15:40:05
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

