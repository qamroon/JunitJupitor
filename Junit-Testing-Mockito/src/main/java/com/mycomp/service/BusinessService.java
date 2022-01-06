package com.mycomp.service;

public class BusinessService {
	private DataService dataService;

	public BusinessService(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	/*
	 *  This is the method we would want to write unit tests for. 
	 *  We would want to test with a wide range of combinations
	 */
	public int findTheGreatestFromAllData() {
		int[] data = dataService.retrieveAllData();
		int greatest = Integer.MIN_VALUE;

		for (int value : data) {
			if (value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}
}
