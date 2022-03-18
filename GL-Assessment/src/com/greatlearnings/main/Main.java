package com.greatlearnings.main;

import com.greatlearnings.com.admindepartment.AdminDepartment;
import com.greatlearnings.com.hrdepartment.HrDepartment;
import com.greatlearnings.com.techdepartment.TechDepartment;

public class Main {

	public static void main(String[] args) {
		AdminDepartment objAdmin = new AdminDepartment();
		System.out.println("Welcome to " + objAdmin.departmentName());
		System.out.println(objAdmin.getTodaysWork());
		System.out.println(objAdmin.getWorkDeadline());
		System.out.println(objAdmin.isTodayAHoliday() + "\n");

		HrDepartment objHr = new HrDepartment();
		System.out.println("Welcome to " + objHr.departmentName());
		System.out.println(objHr.doActivity());
		System.out.println(objHr.getTodaysWork());
		System.out.println(objHr.getWorkDeadline());
		System.out.println(objHr.isTodayAHoliday() + "\n");
		System.out.println("");

		TechDepartment objTech = new TechDepartment();
		System.out.println("Welcome to " + objTech.departmentName());
		System.out.println(objTech.getTodaysWork());
		System.out.println(objTech.getWorkDeadline());
		System.out.println(objTech.getTechStackInformation());
		System.out.println(objTech.isTodayAHoliday());
	}

}
