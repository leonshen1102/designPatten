package com.icbc.lfs.discount;

/*
 * 简单工厂类
 */
public class StrategyFactory {
	public static final String Stra_percent="percentage"; 
	public static final String Stra_price="price"; 
	IStrategy strategy ;

	public  IStrategy create(String type,String moneyRebate) throws Exception{
		if (Stra_percent.equals(type)) {
			strategy = new StrategyByPercentage(moneyRebate);
		}
		if (Stra_price.equals(type)) {
			strategy = new StrategyByPrice(Double.parseDouble(moneyRebate));
		}
		return strategy;
	}

}
