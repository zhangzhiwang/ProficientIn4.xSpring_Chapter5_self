package com.asiainfo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class User5 {
	private List<String> strList;
	private Set<Integer> intSet;
	private Map<Integer, String> mapTest;

	public void setStrList(List<String> strList) {
		this.strList = strList;
	}

	public void setIntSet(Set<Integer> intSet) {
		this.intSet = intSet;
	}

	public void setMapTest(Map<Integer, String> mapTest) {
		this.mapTest = mapTest;
	}

	@Override
	public String toString() {
		return "User5 [strList=" + strList + ", intSet=" + intSet + ", mapTest=" + mapTest + "]";
	}

}
