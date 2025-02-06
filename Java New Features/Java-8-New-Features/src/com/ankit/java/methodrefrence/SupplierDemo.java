package com.ankit.java.methodrefrence;

import java.util.function.Supplier;

class Doctor{
	public Doctor() {
		System.out.println("Doctor::0-param constructor");
	}
}

public class SupplierDemo {
	public static void main(String[] args) {
		Supplier<Doctor> doctor = Doctor::new;
		System.out.println(doctor.get().hashCode());
	}
}
