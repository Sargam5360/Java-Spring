package com.aa.misc;

public class StudentAddress {
	
	Student student;
	Address address;

	StudentAddress()
	{
		
	}
	
	StudentAddress(Student s, Address a){
		
		setStudent(s);
		setAddress(a);		
	}
	
	public void setStudent(Student s) {
		this.student=s;
	}
	
	public void setAddress(Address a) {
		this.address=a;
	}
	
	public Student getStudent() {
		return student;
	}
	
	public Address getAddress() {
		return address;
	}
	
	
	
}
