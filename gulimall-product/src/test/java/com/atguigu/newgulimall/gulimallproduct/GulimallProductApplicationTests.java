package com.atguigu.newgulimall.gulimallproduct;

import com.atguigu.newgulimall.gulimallproduct.entity.BrandEntity;
import com.atguigu.newgulimall.gulimallproduct.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("中华有为");
//        brandService.updateById(brandEntity);
//        System.out.println("保存成功");
        brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1l)).forEach(System.out::println);
    }

}
