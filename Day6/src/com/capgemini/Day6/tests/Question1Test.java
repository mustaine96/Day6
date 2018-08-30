package com.capgemini.Day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.Day6.Laptop;
import com.capgemini.Day6.School;

class Question1Test {

	
	@Test
	void testLaptopProducts() {
		ArrayList<Laptop>laptops=new ArrayList<>();
		assertEquals(true,laptops.add(new Laptop("Dell","Inpiromn","Windows8","i5")));
		laptops.add(new Laptop("HP","something","Windows10","i21"));
		laptops.add(new Laptop("HP","something","Windows10","i21"));

		assertEquals(3,laptops.size());
	}
	
	@Test
	void testSchoolOrder() {
		ArrayList<School>school=new ArrayList<>();
		school.add(new School("vP","mething","Winws10",21));
		school.add(new School("bP","something","Wdows10",21));
		school.add(new School("eP","sothing","Widows10",21));
		school.add(new School("eP","someing","Winws10",21));
		school.add(new School("wP","sething","Widows10",21));
		school.add(new School("yP","somhing","Windws10",21));
		
		for(School a: school)
			System.out.println(a);
	}
	
	@Test
	void testNameAscending() {
		TreeSet<String>names=new TreeSet<>((s1,s2)-> {
			return s1.compareTo(s2);
		});
		names.add("asd");
		names.add("vsd");
		names.add("fgwedf");
		names.add("qwerqwe");
		
		for(String a:names)
			System.out.print(a);
		
	}
	



}
