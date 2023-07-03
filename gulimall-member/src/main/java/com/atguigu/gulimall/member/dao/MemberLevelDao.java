package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级
 * 
 * @author malf
 * @email malfdev@gmail.com
 * @date 2023-07-03 16:54:03
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {
	
}
