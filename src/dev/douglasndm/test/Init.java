package dev.douglasndm.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import dev.douglasndm.modelo.Student;

public class Init {
	public static void main(String[] args) {
		
		System.out.println("Enter the person name");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		String lastName = scanner.next();
		scanner.close();
		
		Student student = new Student(name, lastName, "123456789");

		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("student.bin"));
			objectOutputStream.writeObject(student);
			objectOutputStream.close();
			
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Student.bin"));
			
			try {
				Student readStudent = (Student)objectInputStream.readObject();
				
				System.out.println("From binary file");
				System.out.format("Name: %s, CPF: %s", readStudent.getFullName(), readStudent.getCPF());
				
			} 
			finally {
				objectInputStream.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Binary path not found");
		} catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			System.out.println("Class not found for cast");
			e.printStackTrace();
		}
	}
}
