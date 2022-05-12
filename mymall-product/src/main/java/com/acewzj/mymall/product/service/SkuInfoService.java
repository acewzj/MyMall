package com.acewzj.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.acewzj.common.utils.PageUtils;
import com.acewzj.mymall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author acewzj
 * @email acewzj@qq.com
 * @date 2022-05-12 17:38:33
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

