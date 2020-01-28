package com.icbc.lfs.discount;

/**
 * @author szg
 * ���̶�����Ż���
 */
public class StrategyByPrice implements IStrategy {
	private double moneyRebate = 1d; 
	
	/**
	 * @param moneyRebate
	 * �̶�������ã���ʼ��ʱ������Ҫ���룬������100�������һ��
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
			throw new Exception("�̶��Żݽ��ܳ���ԭ���");
		}
		return returnPrice;
	}

}
