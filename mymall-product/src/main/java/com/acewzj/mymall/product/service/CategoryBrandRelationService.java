package com.acewzj.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.acewzj.common.utils.PageUtils;
import com.acewzj.mymall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author acewzj
 * @email acewzj@qq.com
 * @date 2022-05-12 17:38:33
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

