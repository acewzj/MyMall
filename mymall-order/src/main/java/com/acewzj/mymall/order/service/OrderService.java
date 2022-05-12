package com.acewzj.mymall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.acewzj.common.utils.PageUtils;
import com.acewzj.mymall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author acewzj
 * @email acewzj@qq.com
 * @date 2022-05-12 22:46:38
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

