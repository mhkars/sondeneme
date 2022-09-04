package com.employee;

public class Runner {

	public static void main(String[] args) {
		Engineer engineer = new Engineer("Mustafa");
		System.out.println(engineer);
		engineer.zam(10);
		System.out.println(engineer);
		engineer = new Engineer("Ahmet", 16000);
		System.out.println(engineer);
		engineer.zam(30);
		System.out.println(engineer);

	}

}
