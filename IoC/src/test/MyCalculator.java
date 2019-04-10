package test;

import operator.Calculator;

public class MyCalculator {
	public int fNum, sNum;
	public Calculator calculator;
	
	public MyCalculator(int fNum, int sNum, Calculator calulator) {
		this.fNum=fNum;
		this.sNum=sNum;
		this.calculator=calculator;
	}
	
	public void result() {
		int value = calculator.sum(this.fNum, this.sNum);
	}
}
