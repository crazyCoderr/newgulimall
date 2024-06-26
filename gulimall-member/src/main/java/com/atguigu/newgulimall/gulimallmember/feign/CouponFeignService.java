package com.atguigu.newgulimall.gulimallmember.feign;

import com.atguigu.newgulimall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("coupon")
public interface CouponFeignService {
    @RequestMapping("/gulimallcoupon/coupon/member/list")
    public R memberCouponList();
}
