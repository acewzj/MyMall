package com.acewzj.mymall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.acewzj.common.utils.PageUtils;
import com.acewzj.mymall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author acewzj
 * @email acewzj@qq.com
 * @date 2022-05-12 22:48:33
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

