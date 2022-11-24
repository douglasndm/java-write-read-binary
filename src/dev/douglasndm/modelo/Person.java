package dev.douglasndm.modelo;

import java.io.Serializable;

public abstract class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String lastName;
	private String CPF;
	
	public Person(String name, String lastName, String CPF) {
		this.name = name;
		this.lastName = lastName;
		this.CPF = CPF;
	}
	
	public String getName() {
		return name;
	}
	public String getLastName() {
		return lastName;
	}
	public String getCPF() {
		return CPF;
	}
}
