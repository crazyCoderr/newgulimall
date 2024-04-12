package com.atguigu.newgulimall.gulimallorder.dao;

import com.atguigu.newgulimall.gulimallorder.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hesonglin
 * @email 709270121@qq.com
 * @date 2024-04-12 15:56:16
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
