package com.icbc.lfs.discount;

/**
 * @author szg
 * 按百分比打折类
 */
public class StrategyByPercentage implements IStrategy {
	private double moneyRebate = 1d;
	/**
	 * @param moneyRebate
	 * 打折收费，初始化时，必需要输入折扣率，如八折，就是0.8
	 * @throws Exception 
	 */
	public StrategyByPercentage(String moneyRebate) throws Exception
	{
		this.moneyRebate = Double.parseDouble(moneyRebate);
		if (this.moneyRebate<=0 || this.moneyRebate>=1) {
			throw new Exception("折扣率必须在0和1之间");
		}
	}

	@Override
	public double getDiscountPrice(double originalPrice) {
		// TODO Auto-generated method stub
		return originalPrice*moneyRebate;
	}
}
