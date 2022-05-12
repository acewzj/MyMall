package com.acewzj.mymall.coupon.dao;

import com.acewzj.mymall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author acewzj
 * @email acewzj@qq.com
 * @date 2022-05-12 22:31:25
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
