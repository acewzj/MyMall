package com.acewzj.mymall.order.dao;

import com.acewzj.mymall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author acewzj
 * @email acewzj@qq.com
 * @date 2022-05-12 22:46:38
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
