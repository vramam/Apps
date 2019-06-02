package com.git.demo;

import com.git.demo.Person;

public class MainPerson {

	public static void main(String[] args) {

		// Ramanji Person details
		Person ram = new Person();
		ram.setPid(2047);
		int ramId = ram.getPid();
		System.out.println("Person Ram id " + ramId);
		ram.setpName("Vazza Ramanjaneyulu");
		String ramName = ram.getpName();
		System.out.println("Person Ram Name " + ramName);

		// Hari person Details
		Person hari = new Person();
		hari.setPid(2048);
		int hariId = hari.getPid();
		System.out.println("Person hari id " + hariId);
		hari.setpName("Challa HariKrishna");
		String hariName = hari.getpName();
		System.out.println("Person hari Name " + hariName);

	}

}
