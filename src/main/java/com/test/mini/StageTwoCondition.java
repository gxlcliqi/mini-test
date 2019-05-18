package com.test.mini;

public class StageTwoCondition extends Condition {

	@Override
	public boolean fizz(int i) {
		boolean divide = (i%3==0);
		boolean contain = String.valueOf(i).contains("3");
		return divide || contain;
	}

	@Override
	public boolean buzz(int i) {
		boolean divide = (i%5==0);
		boolean contain = String.valueOf(i).contains("5");
		return divide || contain;
	}

}
