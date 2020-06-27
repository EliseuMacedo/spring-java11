package com.tecinfo.course.entities.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	//Construtor p tipo enum especial private
	private OrderStatus (int code) {
		this.code = code;
	}
	//get

	public int getCode() {
		return code;
	}
	
	//Metodo estatico (sem precisar estanciar) p converner valor numerico para tipo enum
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getCode()==code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code!");
	}
	




	

}
