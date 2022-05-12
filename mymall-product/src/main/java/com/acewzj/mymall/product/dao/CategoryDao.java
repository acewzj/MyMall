package com.acewzj.mymall.product.dao;

import com.acewzj.mymall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author acewzj
 * @email acewzj@qq.com
 * @date 2022-05-12 17:38:33
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
