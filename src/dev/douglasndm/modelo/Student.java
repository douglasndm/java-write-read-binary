package dev.douglasndm.modelo;

import java.io.Serializable;

public class Student extends Person implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private boolean isApproved;

	public Student(String name, String lastName, String CPF) {
		super(name, lastName, CPF);
	}
	
	public String getFullName() {
		return String.format("%s %s", super.getName(), super.getLastName());
	}
	
	public boolean getIsApproved() {
		return this.isApproved;
	}
	
	public void setIsApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}
	
}
