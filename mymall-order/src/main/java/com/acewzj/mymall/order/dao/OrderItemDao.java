package com.acewzj.mymall.order.dao;

import com.acewzj.mymall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author acewzj
 * @email acewzj@qq.com
 * @date 2022-05-12 22:46:38
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
