package com.icbc.lfs.discount;

/**
 * @author szg
 * ���ٷֱȴ�����
 */
public class StrategyByPercentage implements IStrategy {
	private double moneyRebate = 1d;
	/**
	 * @param moneyRebate
	 * �����շѣ���ʼ��ʱ������Ҫ�����ۿ��ʣ�����ۣ�����0.8
	 * @throws Exception 
	 */
	public StrategyByPercentage(String moneyRebate) throws Exception
	{
		this.moneyRebate = Double.parseDouble(moneyRebate);
		if (this.moneyRebate<=0 || this.moneyRebate>=1) {
			throw new Exception("�ۿ��ʱ�����0��1֮��");
		}
	}

	@Override
	public double getDiscountPrice(double originalPrice) {
		// TODO Auto-generated method stub
		return originalPrice*moneyRebate;
	}
}
