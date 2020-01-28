package com.icbc.lfs.discount;

public class Test {

	public static void main(String[] args) {
		// 简单工厂类
		Course course = new Course();
		course.setName("语文");
		course.setPrice(1000);
		IStrategy strategy=null;
		double result=0;
		StrategyFactory sf = new StrategyFactory();
		try {
			strategy = sf.create(StrategyFactory.Stra_price, "900");
			result = strategy.getDiscountPrice(course.getPrice());
			System.out.println("直减："+result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			strategy = sf.create(StrategyFactory.Stra_percent, "0.3");
			result = strategy.getDiscountPrice(course.getPrice());
			System.out.println("打折："+result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
