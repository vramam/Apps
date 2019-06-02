package com.git.demo;

public class MainPerson {

	public static void main(String[] args) {
		
		Person ram=new Person();
		ram.setPid(2047);
		int ramId=ram.getPid();
		System.out.println("Person Ram id "+ramId);
		ram.setpName("Vazza Ramanjaneyulu");
		String ramName=ram.getpName();
		System.out.println("Person Ram Name "+ramName);
		

	}

}
