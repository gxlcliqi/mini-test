package com.test.mini;

public class StageOneCondition extends Condition {

	@Override
	public boolean fizz(int i) {
		return i%3==0;
	}

	@Override
	public boolean buzz(int i) {
		return i%5==0;
	}

}
