package com.test.mini;

import junit.framework.TestCase;

public class StageTwoConditionTest extends TestCase {
	StageTwoCondition condition;
	
	public void setUp() {
		condition = new StageTwoCondition();
	}
	
	public void testFizz() {
		assertFalse(condition.fizz(1));
		assertTrue(condition.fizz(3));
		assertTrue(condition.fizz(12));
		assertTrue(condition.fizz(13));
		assertTrue(condition.fizz(31));
	}

	public void testBuzz() {
		assertFalse(condition.buzz(1));
		assertTrue(condition.buzz(5));
		assertTrue(condition.buzz(10));
		assertTrue(condition.buzz(15));
		assertTrue(condition.buzz(52));
	}

	public void testFizzAndBuzz() {
		assertFalse(condition.fizzAndBuzz(1));
		assertTrue(condition.fizzAndBuzz(15));
		assertFalse(condition.fizzAndBuzz(13));
		assertFalse(condition.fizzAndBuzz(5));
	}


}
