package com.quiz.july.august.app;

import java.util.ArrayList;
import java.util.List;

public class QuizOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double var = 2.0;
		int var3 = 5;
		//long var2 = 12L * var;

	 List<String> vitamins = new ArrayList<String>();
	 vitamins.add("A");
	 vitamins.add("B12");
	 vitamins.add("C");
	 vitamins.set(1, "B");
	 //vitamins.add(1,"D");
	 System.out.println(vitamins.get(0));
	 System.out.println(vitamins.get(1));
	 System.out.println(vitamins.get(2));
	// System.out.println(vitamins.get(3)); error ?  yes or no? 
	// System.out.println(vitamins.get(4));
		
	}

}
