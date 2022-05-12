package com.acewzj.mymall.product;

import com.acewzj.mymall.product.entity.BrandEntity;
import com.acewzj.mymall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MymallProductApplicationTests {
	@Autowired
	BrandService brandService;
	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setName("huawei");
		brandService.save(brandEntity);
	}

}
