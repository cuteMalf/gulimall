package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author malf
 * @email malfdev@gmail.com
 * @date 2023-07-03 17:08:22
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
