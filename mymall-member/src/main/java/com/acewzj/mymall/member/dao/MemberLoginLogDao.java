package com.acewzj.mymall.member.dao;

import com.acewzj.mymall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author acewzj
 * @email acewzj@qq.com
 * @date 2022-05-12 22:44:48
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
