package com.acewzj.mymall.ware.dao;

import com.acewzj.mymall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author acewzj
 * @email acewzj@qq.com
 * @date 2022-05-12 22:48:33
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
