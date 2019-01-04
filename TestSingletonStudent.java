package com.org.collectionPgm;

public class TestSingletonStudent {

	public static void main(String[] args) {
		
		Student s1 = Student.getRef();
		Student s2 = Student.getRef();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
