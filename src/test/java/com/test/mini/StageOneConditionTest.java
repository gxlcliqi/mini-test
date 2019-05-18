package com.test.mini;

import junit.framework.TestCase;

public class StageOneConditionTest extends TestCase {
	StageOneCondition condition;
	
	public void setUp() {
		condition = new StageOneCondition();
	}
	
	public void testFizz() {
		assertFalse(condition.fizz(1));
		assertTrue(condition.fizz(3));
		assertFalse(condition.fizz(13));
		assertFalse(condition.fizz(31));
	}

	public void testBuzz() {
		assertFalse(condition.buzz(1));
		assertTrue(condition.buzz(5));
		assertTrue(condition.buzz(15));
		assertFalse(condition.buzz(13));
	}

	public void testFizzAndBuzz() {
		assertFalse(condition.fizzAndBuzz(1));
		assertTrue(condition.fizzAndBuzz(15));
		assertFalse(condition.fizzAndBuzz(13));
		assertFalse(condition.fizzAndBuzz(5));
	}

}
