package com.acewzj.mymall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.acewzj.common.utils.PageUtils;
import com.acewzj.mymall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author acewzj
 * @email acewzj@qq.com
 * @date 2022-05-12 22:31:25
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
