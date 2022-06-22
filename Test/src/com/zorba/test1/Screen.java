package com.zorba.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Screen {
public static void main(String[] args) {
	
	List listString = new ArrayList<String>();
	
	m1(listString);
}
	public static void m1(List<String> listString) {
		
	
		listString.add("Nischal");
		listString.add("Sushana");
		listString.add("Dahal");
		
		Collections.sort(listString);
		System.out.println(listString);
		
		}
		
	}
	

