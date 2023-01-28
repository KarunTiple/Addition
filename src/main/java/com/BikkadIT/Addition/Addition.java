package com.BikkadIT.Addition;

import org.springframework.stereotype.Component;

@Component
public class Addition {

	public int sum(int a, int b) {
		int c = a + b;
		System.out.println("Addition of a and b : "+c);
		return c;
	}
}