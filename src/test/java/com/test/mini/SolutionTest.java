package com.test.mini;

import java.util.List;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {

	public void testStageOneSolution() {
		
		int n = 100;
		
		StageOneCondition stageOneCondition = new StageOneCondition();
		Solution stageOneSolution = new Solution(stageOneCondition);
		List<String> results = stageOneSolution.caculateAll(n);
		for(int i=0; i<results.size(); i++) {
			System.out.println(results.get(i));
		}
	}

	public void testStageTwoSolution() {
		
		int n = 100;
		
		StageTwoCondition stageTwoCondition = new StageTwoCondition();
		Solution stageTwoSolution = new Solution(stageTwoCondition);
		List<String> results = stageTwoSolution.caculateAll(n);
		for(int i=0; i<results.size(); i++) {
			System.out.println(results.get(i));
		}
	}
}
