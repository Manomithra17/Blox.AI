package com.java;

import java.util.ArrayList;
import java.util.List;

public class Que27ArraytoList {
	public static void main(String[] args) {
//		int a[]= {10,20,30,40,50};
		// or 
		int a[] = new int[5];	
		
		a[0] = 10;
		a[1] = 60;
		a[2] = 20;
		a[3] = 30;
		a[4] = 40;
		
		
		List<Integer> e = new ArrayList<Integer>();	
		
			for (Integer integer : a) {
				
				e.add(integer);
				
			}
		System.out.println(e);
			
		}
				
	}


