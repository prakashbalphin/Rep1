package com.sample;

public class Repository {
	
	private void empDet() {

		System.out.println("name : prakash");
	}
	
	private void empNum() {

		System.out.println("Ph No : 9489884048");
	}

	public static void main(String[] args) {
		
		Repository re = new Repository();
		re.empNum();
		re.empDet();
	}
}
