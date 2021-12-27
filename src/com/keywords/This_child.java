package com.keywords;

public class This_child extends Super_parent{

	int z = 500;

	public void mom() {
		// int z = 500;
		System.out.println(this.z);   // this ----> current class reference
		System.out.println(super.p);  // super -----> parent class reference
	}

	public static void main(String[] args) {
		This_child tc = new This_child();
		tc.mom();

	}
}






