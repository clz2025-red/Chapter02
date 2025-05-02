package com.javaex.ex08;

public class GoodsApp {
    //필드
	
	//생성자
	
	
	//메소드gs
	
	//메소드일반
	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showInfo();
		
		Goods cup = new Goods("머그컵", 2000);
		cup.showInfo();
		
		int a= 3;
		
	}

}
