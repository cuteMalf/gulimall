package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author malf
 * @email malfdev@gmail.com
 * @date 2023-07-03 14:17:39
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
