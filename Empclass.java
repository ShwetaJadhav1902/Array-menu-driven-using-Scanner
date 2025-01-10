package com.arrayscanner;

public class Empclass {
	private int empId;
	private String name;
	private int basicSal;
	private int hra;
	private int da;
	
	
	
	public Empclass(int empId, String name, int basicSal, int hra, int da) {
		
		this.empId = empId;
		this.name = name;
		this.basicSal = basicSal;
		this.hra = hra;
		this.da = da;
	}




	public double calculateSal() {
		return basicSal+hra+da;
	}
	


	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", basicSal=" + basicSal + ", hra=" + hra + ", da=" + da
				+ "]";
	}
	
	
	
	public void printInfo() {
		System.out.println(empId);
		System.out.println(name);
		System.out.println(basicSal);
		System.out.println(hra);
		System.out.println(da);
	
	}
	
	
	
}


