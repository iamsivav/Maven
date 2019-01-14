package com.sv27.maven.app;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class NumericOperations {
	
	static void findStat(double[] inputArray) {
		
		DescriptiveStatistics stat = new DescriptiveStatistics();
		
		for ( double element : inputArray ) {
			stat.addValue(element);
		}
		
		System.out.println("Mean Value : " + stat.getMean() );
		System.out.println("Min Val : " + stat.getMin() );
		System.out.println("Max Val : " + stat.getMax() );
		
	}
	
	public static void main(String[] args) {
		
		double[] ipArray = {1.6, 2.8, 3.4, 0.2, 9.4, 2.3 };
		
		findStat(ipArray);
		
	}

}
