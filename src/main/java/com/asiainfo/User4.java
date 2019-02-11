package com.asiainfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class User4 {
	private String name;
	private List<String> strList = new ArrayList<String>();
	private int[] intArr = new int[3];
	private Set<String> strSet = new HashSet<String>();
	private Map<Integer, String> mapTest = new HashMap<Integer, String>();
	private Map<String, Car5> carMap = new HashMap<String, Car5>();
	private Properties proTest = new Properties();
	private Car5 car5 = new Car5();

	public Properties getProTest() {
		return proTest;
	}

	public void setProTest(Properties proTest) {
		this.proTest = proTest;
	}

	public Map<String, Car5> getCarMap() {
		return carMap;
	}

	public void setCarMap(Map<String, Car5> carMap) {
		this.carMap = carMap;
	}

	public Map<Integer, String> getMapTest() {
		return mapTest;
	}

	public void setMapTest(Map<Integer, String> mapTest) {
		this.mapTest = mapTest;
	}

	public Set<String> getStrSet() {
		return strSet;
	}

	public void setStrSet(Set<String> strSet) {
		this.strSet = strSet;
	}

	public int[] getIntArr() {
		return intArr;
	}

	public void setIntArr(int[] intArr) {
		this.intArr = intArr;
	}

	public List<String> getStrList() {
		return strList;
	}

	public void setStrList(List<String> strList) {
		this.strList = strList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car5 getCar5() {
		return car5;
	}

	public void setCar5(Car5 car5) {
		this.car5 = car5;
	}

	@Override
	public String toString() {
		return "User4 [name=" + name + ", strList=" + strList + ", intArr=" + Arrays.toString(intArr) + ", strSet=" + strSet + ", mapTest=" + mapTest + ", carMap=" + carMap + ", proTest=" + proTest + ", car5=" + car5 + "]";
	}
}
