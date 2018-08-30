package com.capgemini.Day6;

import java.util.ArrayList;

public class School {

	public static String name;
	String city;
	String district;
	int greatSchoolRanking;
	public School(String name, String city, String district, int greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.district = district;
		this.greatSchoolRanking = greatSchoolRanking;
	}
	public School() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}
	public void setGreatSchoolRanking(int greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", district=" + district + ", greatSchoolRanking="
				+ greatSchoolRanking + "]";
	}
	
	
}
