package com.test.mini;

import java.util.List;

/**
 * Entry point to show the solution to the problem, 
 * including both stage one and stage two solutions.
 * 
 * @author Administrator
 *
 */
public class Main {

	public static void main(String[] args) {
		
		int n = 100;
		
		System.out.println("Starting Stage One Solution ---------------------------------");
		
		StageOneCondition stageOneCondition = new StageOneCondition();
		Solution stageOneSolution = new Solution(stageOneCondition);
		List<String> results = stageOneSolution.caculateAll(n);
		for(int i=0; i<results.size(); i++) {
			System.out.println(results.get(i));
		}
		
		System.out.println("Ending Stage One Solution ---------------------------------");
		
		
		System.out.println("Starting Stage Two Solution ---------------------------------");

		
		StageTwoCondition stageTwoCondition = new StageTwoCondition();
		Solution stageTwoSolution = new Solution(stageTwoCondition);
		List<String> results2 = stageTwoSolution.caculateAll(n);
		for(int i=0; i<results2.size(); i++) {
			System.out.println(results2.get(i));
		}		
		System.out.println("Ending Stage Two Solution ---------------------------------");

	}

}
