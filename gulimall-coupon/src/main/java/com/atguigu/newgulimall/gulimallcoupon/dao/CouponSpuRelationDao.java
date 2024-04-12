package com.atguigu.newgulimall.gulimallcoupon.dao;

import com.atguigu.newgulimall.gulimallcoupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author hesonglin
 * @email 709270121@qq.com
 * @date 2024-04-12 15:40:05
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
