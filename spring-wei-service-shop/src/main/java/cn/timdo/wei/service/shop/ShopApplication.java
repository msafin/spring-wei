package cn.timdo.wei.service.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.timdo.wei.service.shop.domain.Shop;

@SpringBootApplication
@RestController
public class ShopApplication {

	@RequestMapping("/shop")
	public Shop getShop() {
		return new Shop("weixin");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
	}
}
