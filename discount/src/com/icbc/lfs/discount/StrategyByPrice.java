package com.icbc.lfs.discount;

/**
 * @author szg
 * 按固定金额优惠类
 */
public class StrategyByPrice implements IStrategy {
	private double moneyRebate = 1d; 
	
	/**
	 * @param moneyRebate
	 * 固定减额费用，初始化时，必需要输入，如输入100，则减少一百
	 */
	public StrategyByPrice(double moneyRebate) {
		super();
		this.moneyRebate = moneyRebate;
	}
	@Override
	public double getDiscountPrice(double originalPrice) throws Exception {
		// TODO Auto-generated method stub
		double returnPrice;
		returnPrice = originalPrice-moneyRebate;
		if (returnPrice<0) {
			throw new Exception("固定优惠金额不能超过原金额");
		}
		return returnPrice;
	}

}
