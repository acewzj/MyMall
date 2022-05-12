package com.acewzj.mymall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.acewzj.common.utils.PageUtils;
import com.acewzj.mymall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author acewzj
 * @email acewzj@qq.com
 * @date 2022-05-12 22:48:33
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

