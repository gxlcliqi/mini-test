package com.test.mini;

/**
 * There are some common functions between stage one and stage two problems.
 * 
 * @author Administrator
 *
 */
public abstract class Condition {
	
	public abstract boolean fizz(int i);
	
	public abstract boolean buzz(int i);
	
	public boolean fizzAndBuzz(int i) {
		return fizz(i) && buzz(i);
	}
}
