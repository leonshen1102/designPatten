/**
 * 
 */
package com.icbc.lfs.discount;

/**
 * @author szg
 * 
 */
public interface IStrategy {
	public double getDiscountPrice(double originalPrice) throws Exception;
}
