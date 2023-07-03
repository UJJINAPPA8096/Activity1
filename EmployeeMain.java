package com.Assignment1;

public class EmployeeMain {
		public static void main(String[] args) {
			
			Employee e = new Employee();
			
			e.setName("ujjinappa");
			e.setAddress("Anantapur");
			e.setMobile("8096503113");
			//System.out.println(e);
			
			System.out.println("Employee Details :-");
			System.out.println("----------------");
			System.out.println("Name    : "+e.getName());
			System.out.println("Address : "+e.getAddress());
			System.out.println("Mobile  : "+e.getMobile());
		}
	}


