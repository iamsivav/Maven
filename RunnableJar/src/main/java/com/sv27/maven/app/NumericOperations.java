/* License information -  GPU V2.0 */
package com.sv27.maven.app;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/**
 * This class is used to calculate the Statistics of an inout array.
 * It uses Apache common-math lib.
 * 
 * @author SV27
 *
 */
public class NumericOperations {
	
	/**
	 * This method calculates the statistics of an input array.
	 * @param inputArray {@link Double} array.
	 */
	static void findStat(double[] inputArray) {
		
		DescriptiveStatistics stat = new DescriptiveStatistics();
		
		for ( double element : inputArray ) {
			stat.addValue(element);
		}
		
		System.out.println("Mean Value : " + stat.getMean() );
		System.out.println("Min Val : " + stat.getMin() );
		System.out.println("Max Val : " + stat.getMax() );
		
	}
	
	/**
	 * This is the main method of our application.
	 * @param args {@link String} Input arguments. 
	 */
	public static void main(String[] args) {
		
		double[] ipArray = {1.6, 2.8, 3.4, 0.2, 9.4, 2.3 };
		
		findStat(ipArray);
		
	}

}
