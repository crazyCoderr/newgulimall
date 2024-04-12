package com.atguigu.newgulimall.gulimallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.newgulimall.common.utils.PageUtils;
import com.atguigu.newgulimall.gulimallmember.entity.UmsIntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author hesonglin
 * @email 709270121@qq.com
 * @date 2024-04-12 16:11:26
 */
public interface UmsIntegrationChangeHistoryService extends IService<UmsIntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

