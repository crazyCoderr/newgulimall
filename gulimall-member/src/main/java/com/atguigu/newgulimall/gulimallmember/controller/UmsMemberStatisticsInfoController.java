package com.atguigu.newgulimall.gulimallmember.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.newgulimall.gulimallmember.entity.UmsMemberStatisticsInfoEntity;
import com.atguigu.newgulimall.gulimallmember.service.UmsMemberStatisticsInfoService;
import com.atguigu.newgulimall.common.utils.PageUtils;
import com.atguigu.newgulimall.common.utils.R;



/**
 * 会员统计信息
 *
 * @author hesonglin
 * @email 709270121@qq.com
 * @date 2024-04-12 16:11:26
 */
@RestController
@RequestMapping("gulimallmember/umsmemberstatisticsinfo")
public class UmsMemberStatisticsInfoController {
    @Autowired
    private UmsMemberStatisticsInfoService umsMemberStatisticsInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("gulimallmember:umsmemberstatisticsinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = umsMemberStatisticsInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("gulimallmember:umsmemberstatisticsinfo:info")
    public R info(@PathVariable("id") Long id){
		UmsMemberStatisticsInfoEntity umsMemberStatisticsInfo = umsMemberStatisticsInfoService.getById(id);

        return R.ok().put("umsMemberStatisticsInfo", umsMemberStatisticsInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("gulimallmember:umsmemberstatisticsinfo:save")
    public R save(@RequestBody UmsMemberStatisticsInfoEntity umsMemberStatisticsInfo){
		umsMemberStatisticsInfoService.save(umsMemberStatisticsInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("gulimallmember:umsmemberstatisticsinfo:update")
    public R update(@RequestBody UmsMemberStatisticsInfoEntity umsMemberStatisticsInfo){
		umsMemberStatisticsInfoService.updateById(umsMemberStatisticsInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("gulimallmember:umsmemberstatisticsinfo:delete")
    public R delete(@RequestBody Long[] ids){
		umsMemberStatisticsInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
