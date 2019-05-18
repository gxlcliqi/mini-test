package com.test.mini;

import java.util.ArrayList;
import java.util.List;

/**
 * Use strategy design pattern to solve different problem of stage one
 * and stage two, by holding a reference to condition. User can get
 * different solutions by switching the condition algorithm.
 * 
 * @author Administrator
 *
 */
public class Solution {
	private Condition condition;
	
	public Solution(Condition condition) {
		this.condition = condition;
	}

	public List<String> caculateAll(int n) {
		List<String> result = new ArrayList<String>(n); 
		for(int i=1;i<=n;i++) {
			result.add(caculateItem(i));
		}
		return result;
	}

	private String caculateItem(int i) {
		if(condition.fizzAndBuzz(i)) {
			return "FizzBuzz";
		} else if(condition.buzz(i)) {
			return "Buzz";
		} else if(condition.fizz(i)) {
			return "Fizz";
		} else {
			return String.valueOf(i);
		}
	}

}
