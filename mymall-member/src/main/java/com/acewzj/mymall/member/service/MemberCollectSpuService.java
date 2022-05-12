package com.acewzj.mymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.acewzj.common.utils.PageUtils;
import com.acewzj.mymall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author acewzj
 * @email acewzj@qq.com
 * @date 2022-05-12 22:44:48
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

