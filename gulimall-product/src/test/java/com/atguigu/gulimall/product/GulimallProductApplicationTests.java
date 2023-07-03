package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    private BrandService brandService;
    @Test
    void contextLoads() {
//        测试插入
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("Apple");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");
//        测试更改
//        brandEntity.setBrandId(1L);
//        brandEntity.setName("MLF");
//        brandService.updateById(brandEntity);
//        System.out.println("修改成功");
//        查询1
        List<BrandEntity> brandEntities = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1));
        brandEntities.forEach(System.out::println);

    }

}
