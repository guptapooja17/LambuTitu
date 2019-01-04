package com.org.collectionPgm;

public class Student {

	private static Student ref;
	
	private Student() {
	}

	public static Student getRef() {
		if (ref == null){
			ref = new Student();
		}
		return ref;
	}
}
