package cn.timdo.wei.service.shop.domain;

public class Shop {
	public Shop(String name) {
		this.name = name;
	}
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
