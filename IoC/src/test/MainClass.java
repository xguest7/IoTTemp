package test;

import operator.*;

public class MainClass {

	public static void main(String[] args) {
		MyCalculator calculator;
		
		calculator = new MyCalculator(10,5,new CalAdd());
		calculator.result();
		
		calculator = new MyCalculator(10,5,new CalSub());
		calculator.result();
		
		calculator = new MyCalculator(10,5,new CalMul());
		calculator.result();
		
		calculator = new MyCalculator(10,5,new CalDiv());
		calculator.result();

	}

}
/* 이건 주석인데 */
/* 이것도 바뀐건데*/
